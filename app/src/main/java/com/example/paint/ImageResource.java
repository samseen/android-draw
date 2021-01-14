package com.example.paint;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageResource {

    private Bitmap mBitmap;

    private Uri imageFileName;

    public void saveImage () {

        int count = 0;

        File sdDirectory = Environment.getExternalStorageDirectory();
        File subDirectory = new File(sdDirectory.toString() + "/Pictures/Paint");

        if (subDirectory.exists()) {

            File[] existing = subDirectory.listFiles();

            for (File file : existing) {

                if (file.getName().endsWith(".jpg") || file.getName().endsWith(".png")) {

                    count++;

                }

            }

        } else {

            subDirectory.mkdir();

        }

        if (subDirectory.exists()) {

            File image = new File(subDirectory, "/drawing_" + (count + 1) + ".png");
            //Set the file name here - get the file name from the image
            Uri imageFile = Uri.fromFile(image);

            setImageFileName(imageFile);

            FileOutputStream fileOutputStream;

            try {

                fileOutputStream = new FileOutputStream(image);

                Boolean bool = mBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);

                fileOutputStream.flush();
                fileOutputStream.close();

                //Toast.makeText(getContext(), "saved", Toast.LENGTH_LONG).show();

            } catch (FileNotFoundException e) {


            } catch (IOException e) {


            }

        }

    }

    public void setImageFileName(Uri imageFileName) {
        this.imageFileName = imageFileName;
    }

    public Uri getImageFileName() {
        return this.imageFileName;
    }
}
