package com.example.zhou.delete.sqlite;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Mr_Zhou on 2017/1/28.
 *
 * SQLite
 *
 */

public class SubSqlite extends SQLiteOpenHelper
{
    public SubSqlite(Context context, String name, SQLiteDatabase.CursorFactory factory, int
            version)
    {
        super(context, name, factory, version);
    }

    public SubSqlite(Context context, String name, SQLiteDatabase.CursorFactory factory, int
            version, DatabaseErrorHandler errorHandler)
    {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }
}
