package model;

import java.util.ArrayList;

public enum Database {
    INSTANCE;

    private ArrayList<Record> db = new ArrayList<Record>();

    {
        db.add(new Record("name1","surname1","20.05.1995","+380559835655","Uganda, M Str. 55a"));
        db.add(new Record("name2","surname2","31.12.2005","+863948539435","Kyiv, Kudryashova str. 28a"));

    }

    public ArrayList<Record> getAllRecords(){
        return db;
    }
    public void addRecord(Record record){
        db.add(record);
    }

}
