package com.mmj.www.neworderactivity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class MenuDataBase extends SQLiteOpenHelper {
    private static final String name = "order.db";
    private static final SQLiteDatabase.CursorFactory factory = null;
    private static final int version = 1;

    public MenuDataBase(Context context) {super(context, name, factory,version);}

    public MenuDataBase(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE menu (menuid TEXT PRIMARY KEY, menuname TEXT, menucoast INTEGER)");
        db.execSQL("CREATE TABLE table_order (datetimeid TEXT PRIMARY KEY, menuname TEXT, menunum INTEGER)");
        db.execSQL("INSERT INTO menu VALUES( null, '아메리카노',2000);");
        db.execSQL("INSERT INTO menu VALUES( null, '카페라떼',4000);");


    }

//    public void onCreate(SQLiteDatabase db) {
//        db.execSQL("CREATE TABLE awe_country (_id INTEGER PRIMARY KEY AUTOINCREMENT, country TEXT, capital TEXT);");
//
//        for(int i=0; i<10; i++){
//            db.execSQL("INSERT INTO awe_country VALUES( null, '" + "Country"+ i + "', '" + "Capital" + i + "');");
//        }
 //   }


    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE awe_country ;");

        onCreate(db);

    }
}
