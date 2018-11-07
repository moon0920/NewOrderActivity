package com.mmj.www.neworderactivity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class MenuDataBase extends SQLiteOpenHelper {
    private static final String name = "menu.db";
    private static final SQLiteDatabase.CursorFactory factory = null;
    private static final int version = 1;

    public MenuDataBase(Context context) {super(context, name, factory,version);}
    public MenuDataBase(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
