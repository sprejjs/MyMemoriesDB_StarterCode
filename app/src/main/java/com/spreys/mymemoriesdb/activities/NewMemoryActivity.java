package com.spreys.mymemoriesdb.activities;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.spreys.mymemoriesdb.R;
import com.spreys.mymemoriesdb.db.MemoryDbHelper;
import com.spreys.mymemoriesdb.model.Memory;

public class NewMemoryActivity extends AppCompatActivity {
    //TODO: Step 1. add a request code for gallery

    //TODO: Step 4. add a camera request code
    private ImageView selectedImageView;
    private EditText titleEditText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_memory_activity);

        this.selectedImageView = (ImageView) findViewById(R.id.new_memory_selected_image);
        this.titleEditText = (EditText) findViewById(R.id.new_memory_title);
    }

    public void openGallery(View view) {
        //TODO: Step 2. launch gallery request
    }

    public void openCamera(View view) {
        //TODO: Step 5. launch camera activity
    }

    public void cancel(View view) {
        finish();
    }

    public void save(View view) {
        //TODO: Step 9. Update model object
        Memory memory = new Memory(titleEditText.getText().toString());
        Bitmap image = ((BitmapDrawable)selectedImageView.getDrawable()).getBitmap();

        new MemoryDbHelper(this).addMemory(memory);
        finish();
    }

    //TODO: Step 3. handle activity result
}
