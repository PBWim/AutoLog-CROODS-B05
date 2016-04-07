package com.autolog.croods.autolog_croods_b05;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by CROODS on 4/7/2016.
 */
public class DatabaseHandler extends SQLiteOpenHelper {

    // Database Version
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "AutoLogDB";
    // table name
    private static final String TABLE_AddNew = "AddNew";
    // Table Columns names
    private static final String KEY_ID = "Id";
    private static final String KEY_RegisterNumber = "RegisterNumber";
    private static final String KEY_OdometerValue = "OdometerValue";
    private static final String KEY_RegistraionExpDate = "RegistraionExpDate";
    private static final String KEY_LastServiceDate = "LastServiceDate";
    private static final String KEY_CreatedDate = "CreatedDate";
    private static final String KEY_IsActive = "IsActive";

    public DatabaseHandler(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_ADDNEW_TABLE = "CREATE TABLE " + TABLE_AddNew + "("
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,"
                + KEY_RegisterNumber + " TEXT NOT NULL,"
                + KEY_OdometerValue + " INTEGER NOT NULL,"
                + KEY_RegistraionExpDate + "DATE NOT NULL,"
                + KEY_LastServiceDate + "DATE,"
                + KEY_CreatedDate + "DATE NOT NULL,"
                + KEY_IsActive + "BOOLEAN NOT NULL" + ")";
        db.execSQL(CREATE_ADDNEW_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS " + TABLE_AddNew);
        // Creating tables again
        onCreate(db);
    }
}
