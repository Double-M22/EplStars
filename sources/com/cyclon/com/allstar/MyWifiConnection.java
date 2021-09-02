package com.cyclon.com.allstar;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.AnimationDrawable;
import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pDeviceList;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.cyclon.com.allstar.Global.GlobalVariables;
import com.cyclon.com.allstar.Service.WifiDirectBroadcastReceiver;
import java.net.InetAddress;
import java.util.ArrayList;

public class MyWifiConnection extends AppCompatActivity {
    public static final String TAG = "MyWifiConnection";
    public static boolean isHost = false;
    private ArrayList<String> data = new ArrayList<>();
    /* access modifiers changed from: private */
    public Intent dataDisplay;
    public Button hostBtn;
    /* access modifiers changed from: private */
    public ImageView host_anim;
    /* access modifiers changed from: private */
    public String info_text;
    public Button joinBtn;
    private WifiP2pManager.Channel mChannel;
    private IntentFilter mIntentFilter;
    private WifiP2pManager mManager;
    private BroadcastReceiver mReceiver;
    public TextView msgText;
    private ArrayAdapter<String> myAdapter = null;
    /* access modifiers changed from: private */
    public ListView wifi_list;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(1024, 1024);
        setContentView((int) R.layout.activity_my_wifi_connection);
        this.hostBtn = (Button) findViewById(R.id.host_btn);
        this.joinBtn = (Button) findViewById(R.id.join_btn);
        this.msgText = (TextView) findViewById(R.id.wifi_warning_text);
        ListView listView = (ListView) findViewById(R.id.wifi_list);
        this.wifi_list = listView;
        listView.setVisibility(8);
        ImageView imageView = (ImageView) findViewById(R.id.host_anim);
        this.host_anim = imageView;
        imageView.setImageResource(R.drawable.wifi_animation);
        this.host_anim.setVisibility(8);
        this.wifi_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                WifiDirectBroadcastReceiver.connect(i);
            }
        });
        IntentFilter intentFilter = new IntentFilter();
        this.mIntentFilter = intentFilter;
        intentFilter.addAction("android.net.wifi.p2p.STATE_CHANGED");
        this.mIntentFilter.addAction("android.net.wifi.p2p.PEERS_CHANGED");
        this.mIntentFilter.addAction("android.net.wifi.p2p.CONNECTION_STATE_CHANGE");
        this.mIntentFilter.addAction("android.net.wifi.p2p.THIS_DEVICE_CHANGED");
        WifiP2pManager wifiP2pManager = (WifiP2pManager) getSystemService("wifip2p");
        this.mManager = wifiP2pManager;
        this.mChannel = wifiP2pManager.initialize(this, getMainLooper(), (WifiP2pManager.ChannelListener) null);
        this.mReceiver = new WifiDirectBroadcastReceiver(this.mManager, this.mChannel, this, this);
    }

    public void play(InetAddress hostAddress, Boolean host) {
        Intent intent = new Intent(this, MultiPlayer.class);
        this.dataDisplay = intent;
        intent.putExtra("HostAddress", hostAddress.getHostAddress());
        this.dataDisplay.putExtra("IsHost", host);
        this.dataDisplay.putExtra("Connected", true);
        if (host.booleanValue()) {
            startActivity(this.dataDisplay);
        } else {
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    MyWifiConnection myWifiConnection = MyWifiConnection.this;
                    myWifiConnection.startActivity(myWifiConnection.dataDisplay);
                }
            }, 2000);
        }
    }

    public void displayPeers(WifiP2pDeviceList peerList) {
        this.data.clear();
        for (WifiP2pDevice peers : peerList.getDeviceList()) {
            ArrayList<String> arrayList = this.data;
            arrayList.add(peers.deviceName + "\n" + peers.deviceAddress);
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.wifi_items, this.data);
        this.myAdapter = arrayAdapter;
        this.wifi_list.setAdapter(arrayAdapter);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        registerReceiver(this.mReceiver, this.mIntentFilter);
        GlobalVariables.isReceiverRegistered = true;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        unregisterReceiver(this.mReceiver);
        GlobalVariables.isReceiverRegistered = false;
    }

    private void unRegReceiver() {
        unregisterReceiver(this.mReceiver);
        GlobalVariables.isReceiverRegistered = false;
    }

    public void join(View view) {
        this.wifi_list.setVisibility(0);
        this.hostBtn.setClickable(false);
        this.joinBtn.setClickable(false);
        isHost = false;
        this.mManager.discoverPeers(this.mChannel, new WifiP2pManager.ActionListener() {
            public void onSuccess() {
                String unused = MyWifiConnection.this.info_text = "Searching!";
                MyWifiConnection.this.msgText.setText(MyWifiConnection.this.info_text);
            }

            public void onFailure(int reasonCode) {
                MyWifiConnection.this.wifi_list.setVisibility(8);
                MyWifiConnection.this.hostBtn.setClickable(true);
                MyWifiConnection.this.joinBtn.setClickable(true);
                if (reasonCode == 2) {
                    String unused = MyWifiConnection.this.info_text = "Error: Please turn on wifi!";
                    MyWifiConnection.this.msgText.setText(MyWifiConnection.this.info_text);
                    return;
                }
                Log.d(MyWifiConnection.TAG, "" + reasonCode);
            }
        });
    }

    public void host(View view) {
        this.host_anim.setVisibility(0);
        final AnimationDrawable wifi_anim = (AnimationDrawable) this.host_anim.getDrawable();
        wifi_anim.start();
        this.hostBtn.setClickable(false);
        this.joinBtn.setClickable(false);
        isHost = true;
        this.mManager.discoverPeers(this.mChannel, new WifiP2pManager.ActionListener() {
            public void onSuccess() {
                String unused = MyWifiConnection.this.info_text = "Creating Connection! ";
                MyWifiConnection.this.msgText.setText(MyWifiConnection.this.info_text);
            }

            public void onFailure(int reasonCode) {
                MyWifiConnection.this.host_anim.setVisibility(8);
                wifi_anim.stop();
                MyWifiConnection.this.hostBtn.setClickable(true);
                MyWifiConnection.this.joinBtn.setClickable(true);
                if (reasonCode == 2) {
                    String unused = MyWifiConnection.this.info_text = "Error: Please turn on wifi!";
                    MyWifiConnection.this.msgText.setText(MyWifiConnection.this.info_text);
                    return;
                }
                Log.d(MyWifiConnection.TAG, "" + reasonCode);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        finish();
    }
}
