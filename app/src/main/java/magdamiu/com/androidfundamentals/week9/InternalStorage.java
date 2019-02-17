package magdamiu.com.androidfundamentals.week9;

import android.content.Context;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InternalStorage {
    protected void writeFileInternal(Context context, String fileName) {
        String fileContents = "Hello Android!";
        FileOutputStream outputStream;
        try {
            outputStream = context.openFileOutput(fileName, Context.MODE_PRIVATE);
            outputStream.write(fileContents.getBytes());
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected String readFileInternal(Context context, File file) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = context.openFileInput(file.getName());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        char[] inputBuffer = new char[100];
        StringBuffer stringBuffer = new StringBuffer();
        int charRead;
        while ((charRead = inputStreamReader.read(inputBuffer)) > 0) {
            stringBuffer.append(String.copyValueOf(
                    inputBuffer, 0, charRead));
        }
        inputStreamReader.close();
        return stringBuffer.toString();
    }

}
