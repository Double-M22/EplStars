package com.cyclon.com.allstar.Data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.cyclon.com.allstar.Constants.AppConstants;

public class ScoresDatabase extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;

    public ScoresDatabase(Context context) {
        super(context, AppConstants.SCORE_DB, (SQLiteDatabase.CursorFactory) null, 1);
    }

    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(" CREATE TABLE HighScoresTable ( ID INTEGER PRIMARY KEY AUTOINCREMENT, HighScores  TEXT NOT NULL ); ");
        sqLiteDatabase.execSQL(" CREATE TABLE GrandScoreTable ( PlayerName TEXT NOT NULL, GrandName TEXT NOT NULL, GrandScore TEXT NOT NULL ); ");
    }

    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(" DROP TABLE IF EXIST GrandScoreTable");
        sqLiteDatabase.execSQL(" DROP TABLE IF EXIST HighScoresTable");
        onCreate(sqLiteDatabase);
    }

    public boolean insertHighScore(String score) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(AppConstants.HIGH_SCORES, score);
        return db.insert(AppConstants.HIGH_SCORE_TABLE, (String) null, cv) != -1;
    }

    public boolean insertGrandScore(String username, String grand_name, String score) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(AppConstants.PLAYER_NAME, username);
        cv.put(AppConstants.GRAND_NAME, grand_name);
        cv.put(AppConstants.GRAND_SCORE, score);
        return db.insert(AppConstants.GRAND_SCORE_TABLE, (String) null, cv) != -1;
    }

    public boolean updateGrandScore(String username, String grand_name, String score) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(AppConstants.PLAYER_NAME, username);
        cv.put(AppConstants.GRAND_NAME, grand_name);
        cv.put(AppConstants.GRAND_SCORE, score);
        if (((long) db.update(AppConstants.GRAND_SCORE_TABLE, cv, "GrandScore = ? ", new String[]{score})) != -1) {
            return true;
        }
        return false;
    }

    public boolean updateHighScore(String score, String toReplace) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(AppConstants.HIGH_SCORES, score);
        if (((long) db.update(AppConstants.HIGH_SCORE_TABLE, cv, "HighScores = ? ", new String[]{toReplace})) != -1) {
            return true;
        }
        return false;
    }

    public Cursor getHighScores() {
        return getReadableDatabase().rawQuery(" select * from HighScoresTable", (String[]) null);
    }

    public Cursor getGrandScore() {
        return getReadableDatabase().rawQuery(" select * from GrandScoreTable", (String[]) null);
    }
}
