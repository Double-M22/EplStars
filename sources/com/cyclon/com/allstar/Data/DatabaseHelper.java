package com.cyclon.com.allstar.Data;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.cyclon.com.allstar.Constants.AppConstants;
import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {
    private Context context;
    private SQLiteDatabase db;

    public DatabaseHelper(Context context2) {
        super(context2, AppConstants.TEAM_DB, (SQLiteDatabase.CursorFactory) null, 1);
        this.context = context2;
    }

    public void onCreate(SQLiteDatabase db2) {
    }

    public void onUpgrade(SQLiteDatabase db2, int oldVersion, int newVersion) {
    }

    private void openDatabase() {
        String dbPath = this.context.getDatabasePath(AppConstants.TEAM_DB).getPath();
        SQLiteDatabase sQLiteDatabase = this.db;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            this.db = SQLiteDatabase.openDatabase(dbPath, (SQLiteDatabase.CursorFactory) null, 0);
        }
    }

    private void closeDatabase() {
        SQLiteDatabase sQLiteDatabase = this.db;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
    }

    public List<Data> getDataItems(Teams teams) {
        List<Data> myData = new ArrayList<>();
        openDatabase();
        Cursor cursor = getCursor(teams);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            myData.add(new Data(cursor.getInt(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5), cursor.getString(6)));
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return myData;
    }

    /* renamed from: com.cyclon.com.allstar.Data.DatabaseHelper$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$cyclon$com$allstar$Data$Teams;

        static {
            int[] iArr = new int[Teams.values().length];
            $SwitchMap$com$cyclon$com$allstar$Data$Teams = iArr;
            try {
                iArr[Teams.arsenal.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$cyclon$com$allstar$Data$Teams[Teams.bournemouth.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$cyclon$com$allstar$Data$Teams[Teams.brighton.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$cyclon$com$allstar$Data$Teams[Teams.chelsea.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$com$cyclon$com$allstar$Data$Teams[Teams.everton.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$com$cyclon$com$allstar$Data$Teams[Teams.manchesterCity.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                $SwitchMap$com$cyclon$com$allstar$Data$Teams[Teams.manchesterUnited.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                $SwitchMap$com$cyclon$com$allstar$Data$Teams[Teams.leicester.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                $SwitchMap$com$cyclon$com$allstar$Data$Teams[Teams.liverpool.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
            try {
                $SwitchMap$com$cyclon$com$allstar$Data$Teams[Teams.crystalPalace.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
            }
            try {
                $SwitchMap$com$cyclon$com$allstar$Data$Teams[Teams.tottenham.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
            }
            try {
                $SwitchMap$com$cyclon$com$allstar$Data$Teams[Teams.burnley.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
            }
            try {
                $SwitchMap$com$cyclon$com$allstar$Data$Teams[Teams.newcastle.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
            }
            try {
                $SwitchMap$com$cyclon$com$allstar$Data$Teams[Teams.southampton.ordinal()] = 14;
            } catch (NoSuchFieldError e14) {
            }
            try {
                $SwitchMap$com$cyclon$com$allstar$Data$Teams[Teams.swansea.ordinal()] = 15;
            } catch (NoSuchFieldError e15) {
            }
            try {
                $SwitchMap$com$cyclon$com$allstar$Data$Teams[Teams.stokeCity.ordinal()] = 16;
            } catch (NoSuchFieldError e16) {
            }
            try {
                $SwitchMap$com$cyclon$com$allstar$Data$Teams[Teams.watford.ordinal()] = 17;
            } catch (NoSuchFieldError e17) {
            }
            try {
                $SwitchMap$com$cyclon$com$allstar$Data$Teams[Teams.westBrom.ordinal()] = 18;
            } catch (NoSuchFieldError e18) {
            }
            try {
                $SwitchMap$com$cyclon$com$allstar$Data$Teams[Teams.westHam.ordinal()] = 19;
            } catch (NoSuchFieldError e19) {
            }
            try {
                $SwitchMap$com$cyclon$com$allstar$Data$Teams[Teams.huddersfield.ordinal()] = 20;
            } catch (NoSuchFieldError e20) {
            }
        }
    }

    private Cursor getCursor(Teams teams) {
        switch (AnonymousClass1.$SwitchMap$com$cyclon$com$allstar$Data$Teams[teams.ordinal()]) {
            case 1:
                SQLiteDatabase sQLiteDatabase = this.db;
                return sQLiteDatabase.rawQuery("select * from " + teams.name(), (String[]) null);
            case 2:
                SQLiteDatabase sQLiteDatabase2 = this.db;
                return sQLiteDatabase2.rawQuery("select * from " + teams.name(), (String[]) null);
            case 3:
                SQLiteDatabase sQLiteDatabase3 = this.db;
                return sQLiteDatabase3.rawQuery("select * from " + teams.name(), (String[]) null);
            case 4:
                SQLiteDatabase sQLiteDatabase4 = this.db;
                return sQLiteDatabase4.rawQuery("select * from " + teams.name(), (String[]) null);
            case 5:
                SQLiteDatabase sQLiteDatabase5 = this.db;
                return sQLiteDatabase5.rawQuery("select * from " + teams.name(), (String[]) null);
            case 6:
                SQLiteDatabase sQLiteDatabase6 = this.db;
                return sQLiteDatabase6.rawQuery("select * from " + teams.name(), (String[]) null);
            case 7:
                SQLiteDatabase sQLiteDatabase7 = this.db;
                return sQLiteDatabase7.rawQuery("select * from " + teams.name(), (String[]) null);
            case 8:
                SQLiteDatabase sQLiteDatabase8 = this.db;
                return sQLiteDatabase8.rawQuery("select * from " + teams.name(), (String[]) null);
            case 9:
                SQLiteDatabase sQLiteDatabase9 = this.db;
                return sQLiteDatabase9.rawQuery("select * from " + teams.name(), (String[]) null);
            case 10:
                SQLiteDatabase sQLiteDatabase10 = this.db;
                return sQLiteDatabase10.rawQuery("select * from " + teams.name(), (String[]) null);
            case 11:
                SQLiteDatabase sQLiteDatabase11 = this.db;
                return sQLiteDatabase11.rawQuery("select * from " + teams.name(), (String[]) null);
            case 12:
                SQLiteDatabase sQLiteDatabase12 = this.db;
                return sQLiteDatabase12.rawQuery("select * from " + teams.name(), (String[]) null);
            case 13:
                SQLiteDatabase sQLiteDatabase13 = this.db;
                return sQLiteDatabase13.rawQuery("select * from " + teams.name(), (String[]) null);
            case 14:
                SQLiteDatabase sQLiteDatabase14 = this.db;
                return sQLiteDatabase14.rawQuery("select * from " + teams.name(), (String[]) null);
            case 15:
                SQLiteDatabase sQLiteDatabase15 = this.db;
                return sQLiteDatabase15.rawQuery("select * from " + teams.name(), (String[]) null);
            case 16:
                SQLiteDatabase sQLiteDatabase16 = this.db;
                return sQLiteDatabase16.rawQuery("select * from " + teams.name(), (String[]) null);
            case 17:
                SQLiteDatabase sQLiteDatabase17 = this.db;
                return sQLiteDatabase17.rawQuery("select * from " + teams.name(), (String[]) null);
            case 18:
                SQLiteDatabase sQLiteDatabase18 = this.db;
                return sQLiteDatabase18.rawQuery("select * from " + teams.name(), (String[]) null);
            case 19:
                SQLiteDatabase sQLiteDatabase19 = this.db;
                return sQLiteDatabase19.rawQuery("select * from " + teams.name(), (String[]) null);
            case 20:
                SQLiteDatabase sQLiteDatabase20 = this.db;
                return sQLiteDatabase20.rawQuery("select * from " + teams.name(), (String[]) null);
            default:
                return null;
        }
    }
}
