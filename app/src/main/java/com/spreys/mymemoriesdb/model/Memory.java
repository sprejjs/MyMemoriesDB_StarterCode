package com.spreys.mymemoriesdb.model;

import android.database.Cursor;

public class Memory {
    private String title;

    //TODO: Step 7. Add ab image variable and a getter

    public static final int COL_ID = 0;
    public static final int COL_TITLE = 1;
    public static final int COL_IMAGE = 2;

    public Memory(Cursor cursor) {
        this.title = cursor.getString(COL_TITLE);
        //TODO: Step 14: Read the new column
    }

    public Memory(String title) {
        this.title = title;

        //TODO: Step 8. Accept bitmap variable
    }

    public String getTitle() {
        return this.title;
    }

    //TODO: Step 13: Add a new getter

    //TODO: Step 16: Resize the image
}
