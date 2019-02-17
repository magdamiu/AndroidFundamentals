package magdamiu.com.androidfundamentals.week9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Environment;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExternalStorage {
    protected void writeFileExternal(Context context, String fileName) {
        String content = "Android - External storage";
        File textFile = new File(Environment.getExternalStorageDirectory(), fileName);
        try {
            FileOutputStream fos = new FileOutputStream(textFile);

            fos.write(content.getBytes());
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected String readFileExternal(File file) throws IOException {
        StringBuffer contentOfTheFile = new StringBuffer();
        FileInputStream fis = new FileInputStream(file);
        DataInputStream in = new DataInputStream(fis);
        BufferedReader br =
                new BufferedReader(new InputStreamReader(in));
        String strLine;
        while ((strLine = br.readLine()) != null) {
            contentOfTheFile.append(strLine);
        }
        in.close();
        return contentOfTheFile.toString();
    }
}
