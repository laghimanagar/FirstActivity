package com.example.laghima.firstactivity;

/**
 * Created by laghima on 9/21/2015.
 */
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class SignuphereDBHelper {
    public static final String Firstname="Firstname";
    public static final String Lastname="Lastname";
    public static final String Email="Email";
    public static final String Password="Password";
    private static final String databasename="SignuphereDB";
    private static final String tablename="Signuphere";
    private static final int databaseversion=1;
    private static final String create_table="create table Signuphere(Firstname varchar,Lastname varchar,email varchar,password varchar);";
    private final Context ct;
    private DatabaseHelper dbHelper;
    private SQLiteDatabase database;
    public SignuphereDBHelper(Context context)
    {
        this.ct=context;
        dbHelper=new DatabaseHelper(ct);
    }
    private static class DatabaseHelper extends SQLiteOpenHelper {
        DatabaseHelper(Context c) {
            super(c, databasename, null, databaseversion);
        }

        @Override
        public void onCreate(SQLiteDatabase database) {
            try {
                database.execSQL(create_table);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("drop table if exists signuphere");
            onCreate(db);
        }
    }
    public SignuphereDBHelper connect() throws SQLException
    {
        database=dbHelper.getWritableDatabase();
        return this;
    }
    public void disconnect()
    {
        dbHelper.close();
    }
    public long insertSignuphere(String firstname,String lastname,String email,String password)
    {
        ContentValues cv=new ContentValues();
        cv.put(Firstname, Firstname);
        cv.put(Lastname,Lastname);
        cv.put(Email,Email);
        cv.put(Password,Password);
        this.connect();
        return database.insert(tablename,null,cv);
    }
}

