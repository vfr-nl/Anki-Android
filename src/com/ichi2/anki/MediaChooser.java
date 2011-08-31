package com.ichi2.anki;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Get an image from a gallery or file manager
 * Found at http://stackoverflow.com/questions/2169649
 * @author mad/hcpl
 *
 */
public class MediaChooser extends Activity {

    private static final int SELECT_PICTURE = 1;
    private static final int TAKE_PICTURE = 2;

    private String selectedImagePath;
    private String filemanagerstring;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.media_chooser);

        ((Button) findViewById(R.id.SelectPictureButton))
        .setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {

                // in onCreate or any event where your want the user to
                // select a file
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent,
                        "Select Picture"), SELECT_PICTURE);
            }
        });
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            if (requestCode == SELECT_PICTURE) {
                Uri selectedImageUri = data.getData();

                //OI FILE Manager
                filemanagerstring = selectedImageUri.getPath();

                //MEDIA GALLERY
                selectedImagePath = getPath(selectedImageUri);

                //DEBUG PURPOSE - you can delete this if you want
                if(selectedImagePath!=null) {
                    Log.i(AnkiDroidApp.TAG, selectedImagePath);
                }
                else {
                    Log.i(AnkiDroidApp.TAG, "selectedImagePath is null");
                }
                if(filemanagerstring!=null) {
                    Log.i(AnkiDroidApp.TAG, filemanagerstring);
                }
                else {
                    Log.i(AnkiDroidApp.TAG, "filemanagerstring is null");
                }

                //NOW WE HAVE OUR WANTED STRING
                if(selectedImagePath!=null)
                    Log.i(AnkiDroidApp.TAG, "Selected image via OI file manager: " + selectedImagePath);
                else
                    Log.i(AnkiDroidApp.TAG, "Selected image via Media gallery: " + filemanagerstring);
            }
        }
    }

    public String getPath(Uri uri) {
        String[] projection = { MediaStore.Images.Media.DATA };
        Cursor cursor = managedQuery(uri, projection, null, null, null);
        if(cursor!=null)
        {
            //HERE YOU WILL GET A NULLPOINTER IF CURSOR IS NULL
            //THIS CAN BE, IF YOU USED OI FILE MANAGER FOR PICKING THE MEDIA
            int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
            cursor.moveToFirst();
            return cursor.getString(column_index);
        }
        else return null;
    }
}