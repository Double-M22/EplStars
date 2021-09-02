package com.cyclon.com.allstar.Service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.p2p.WifiP2pConfig;
import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pDeviceList;
import android.net.wifi.p2p.WifiP2pInfo;
import android.net.wifi.p2p.WifiP2pManager;
import android.util.Log;
import androidx.core.app.ActivityCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.cyclon.com.allstar.Constants.AppConstants;
import com.cyclon.com.allstar.Global.GlobalVariables;
import com.cyclon.com.allstar.MyWifiConnection;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

public class WifiDirectBroadcastReceiver extends BroadcastReceiver {
    /* access modifiers changed from: private */
    public static MyWifiConnection mActivity;
    private static WifiP2pManager.Channel mChannel;
    /* access modifiers changed from: private */
    public static List<WifiP2pConfig> mConfigs;
    private static Context mContext;
    private static WifiP2pDevice mDevice;
    private static WifiP2pManager mManager;
    /* access modifiers changed from: private */
    public static List<WifiP2pDevice> mPeers;
    /* access modifiers changed from: private */
    public static String result;
    WifiP2pManager.ConnectionInfoListener infoListener = new WifiP2pManager.ConnectionInfoListener() {
        public void onConnectionInfoAvailable(WifiP2pInfo info) {
            InetAddress groupOwnerAddress = info.groupOwnerAddress;
            if (!info.groupFormed) {
                return;
            }
            if (info.isGroupOwner) {
                WifiDirectBroadcastReceiver.mActivity.msgText.setText("Host");
                WifiDirectBroadcastReceiver.mActivity.play(groupOwnerAddress, true);
                return;
            }
            WifiDirectBroadcastReceiver.mActivity.msgText.setText("Client");
            WifiDirectBroadcastReceiver.mActivity.play(groupOwnerAddress, false);
        }
    };

    public WifiDirectBroadcastReceiver(WifiP2pManager manager, WifiP2pManager.Channel channel, MyWifiConnection intermediateActivity, Context context) {
        mActivity = intermediateActivity;
        mChannel = channel;
        mManager = manager;
        mContext = context;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (!action.equals(AppConstants.ACTION_STOP_BROADCAST)) {
            if ("android.net.wifi.p2p.STATE_CHANGED".equals(action)) {
                if (intent.getIntExtra("wifi_p2p_state", -1) == 2) {
                    mActivity.msgText.setText("Wifi turned on");
                    return;
                }
                mActivity.msgText.setText("Wifi turned off");
                if (GlobalVariables.isMultiplayer) {
                    LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent(AppConstants.ACTION_CLOSE_ACTIVITY));
                }
                if (GlobalVariables.isWifiConnected) {
                    disconnect();
                }
                Object obj = "Wifi turned off";
            } else if ("android.net.wifi.p2p.PEERS_CHANGED".equals(action)) {
                mPeers = new ArrayList();
                mConfigs = new ArrayList();
                if (mManager != null) {
                    WifiP2pManager.PeerListListener peerListListener = new WifiP2pManager.PeerListListener() {
                        public void onPeersAvailable(WifiP2pDeviceList peerList) {
                            WifiDirectBroadcastReceiver.mPeers.clear();
                            WifiDirectBroadcastReceiver.mPeers.addAll(peerList.getDeviceList());
                            if (!MyWifiConnection.isHost) {
                                WifiDirectBroadcastReceiver.mActivity.displayPeers(peerList);
                            }
                            for (int i = 0; i < peerList.getDeviceList().size(); i++) {
                                WifiP2pConfig config = new WifiP2pConfig();
                                config.deviceAddress = ((WifiP2pDevice) WifiDirectBroadcastReceiver.mPeers.get(i)).deviceAddress;
                                WifiDirectBroadcastReceiver.mConfigs.add(config);
                            }
                        }
                    };
                    if (ActivityCompat.checkSelfPermission(mContext, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        mManager.requestPeers(mChannel, peerListListener);
                    }
                }
            } else if ("android.net.wifi.p2p.CONNECTION_STATE_CHANGE".equals(action)) {
                if (GlobalVariables.isMultiplayer) {
                    LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent(AppConstants.ACTION_CLOSE_ACTIVITY));
                }
                if (GlobalVariables.isWifiConnected) {
                    disconnect();
                }
                if (mManager != null && ((NetworkInfo) intent.getParcelableExtra("networkInfo")).isConnected()) {
                    mManager.requestConnectionInfo(mChannel, this.infoListener);
                }
            } else {
                "android.net.wifi.p2p.THIS_DEVICE_CHANGED".equals(action);
            }
        }
    }

    public static void connect(int position) {
        WifiP2pConfig config = mConfigs.get(position);
        WifiP2pDevice wifiP2pDevice = mPeers.get(position);
        mDevice = wifiP2pDevice;
        config.deviceAddress = wifiP2pDevice.deviceAddress;
        if (ActivityCompat.checkSelfPermission(mContext, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            mManager.connect(mChannel, config, new WifiP2pManager.ActionListener() {
                public void onSuccess() {
                    GlobalVariables.isWifiConnected = true;
                    Log.d(MyWifiConnection.TAG, "Connect Succeeded");
                }

                public void onFailure(int reason) {
                    Log.d(MyWifiConnection.TAG, "Connect failed: Error " + reason);
                }
            });
        }
    }

    public static String disconnect() {
        WifiP2pManager wifiP2pManager = mManager;
        if (wifiP2pManager == null) {
            return null;
        }
        wifiP2pManager.removeGroup(mChannel, new WifiP2pManager.ActionListener() {
            public void onSuccess() {
                GlobalVariables.isWifiConnected = false;
                String unused = WifiDirectBroadcastReceiver.result = "Success";
            }

            public void onFailure(int reason) {
                String unused = WifiDirectBroadcastReceiver.result = "Failure";
            }
        });
        return result;
    }
}
