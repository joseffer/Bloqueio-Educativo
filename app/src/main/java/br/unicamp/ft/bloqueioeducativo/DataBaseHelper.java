package br.unicamp.ft.bloqueioeducativo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper extends SQLiteOpenHelper{

    private static final String DB_NAME = "Questionario";
    private static final int DB_VERSION = 1;
    DataBaseHelper(Context context){
        super(context,DB_NAME,null,DB_VERSION);
    }

    @Override
    public void onCreate (SQLiteDatabase db){
        db.execSQL("CREATE TABLE Questionario" +
                "(_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "Questao TEXT, " +
                 "Imagem BLOB, " +
                "Questao1 INTEGER, " +
                "Questao2 INTEGER, " +
                "Questao3 INTEGER, " +
                "Questao4 INTEGER); ");
    }
    @Override
    public void onUpgrade (SQLiteDatabase db, int oldVersion, int newVersion){}





}
