package magdamiu.com.androidfundamentals.week9;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import magdamiu.com.androidfundamentals.R;
import magdamiu.com.androidfundamentals.utils.Logging;

public class FileManagementActivity extends AppCompatActivity {

    private static final int REQUEST_CODE_WRITE_EXTERNAL_STORAGE_PERMISSION = 33;
    private static final int REQUEST_CODE_READ_EXTERNAL_STORAGE_PERMISSION = 34;

    private EditText mEditTextFileName;
    private TextView mTextViewContent;

    private InternalStorage mInternalStorage;
    private ExternalStorage mExternalStorage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_management);

        mInternalStorage = new InternalStorage();
        mExternalStorage = new ExternalStorage();

        initView();
    }

    private void initView() {
        mEditTextFileName = findViewById(R.id.edittext_file_name);
        mTextViewContent = findViewById(R.id.textview_content);
    }

    public void createFileInternalOnClick(View view) {
        if (mEditTextFileName != null && mEditTextFileName.getText() != null) {
            String fileName = mEditTextFileName.getText().toString();
            if (!fileName.isEmpty() && fileName != null) {
                mInternalStorage.writeFileInternal(FileManagementActivity.this, fileName);
            } else {
                Toast.makeText(this, getString(R.string.file_saved), Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, getString(R.string.cannot_save), Toast.LENGTH_SHORT).show();
        }
    }

    public void readFileInternalOnClick(View view) {
        if (mEditTextFileName != null && mEditTextFileName.getText() != null) {
            String fileName = mEditTextFileName.getText().toString();
            if (!fileName.isEmpty() && fileName != null) {
                mTextViewContent.setText("");
                try {
                    mTextViewContent.setText("Read file internal = ");
                    mTextViewContent.append(
                            mInternalStorage.readFileInternal(FileManagementActivity.this,
                                    new File(fileName)));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void createFileExternalOnClick(View view) {
        if (isExternalStorageWritable()) {
            int writeExternalStoragePermission =
                    ContextCompat.checkSelfPermission(FileManagementActivity.this,
                            Manifest.permission.WRITE_EXTERNAL_STORAGE);

            if (!checkPermission(writeExternalStoragePermission)) {
                ActivityCompat.requestPermissions(FileManagementActivity.this,
                        new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                        REQUEST_CODE_WRITE_EXTERNAL_STORAGE_PERMISSION);
            } else {
                if (mEditTextFileName != null && mEditTextFileName.getText() != null) {
                    String fileName = mEditTextFileName.getText().toString();
                    if (!fileName.isEmpty() && fileName != null) {
                        mExternalStorage.writeFileExternal(FileManagementActivity.this, fileName);

                        Toast.makeText(FileManagementActivity.this, getString(R.string.file_saved),
                                Toast.LENGTH_LONG).show();
                    }
                }
            }
        } else {
            Toast.makeText(FileManagementActivity.this, getString(R.string.cannot_write_external),
                    Toast.LENGTH_LONG).show();
        }
    }

    public void readFileExternalOnClick(View view) {
        if (isExternalStorageWritable()) {
            int readExternalStoragePermission =
                    ContextCompat.checkSelfPermission(FileManagementActivity.this,
                            Manifest.permission.READ_EXTERNAL_STORAGE);
            if (!checkPermission(readExternalStoragePermission)) {
                ActivityCompat.requestPermissions(FileManagementActivity.this,
                        new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                        REQUEST_CODE_READ_EXTERNAL_STORAGE_PERMISSION);
            } else {
                readFile();
            }
        } else {
            Toast.makeText(FileManagementActivity.this, getString(R.string.cannot_write_external),
                    Toast.LENGTH_LONG).show();
        }
    }

    private void readFile() {
        if (mEditTextFileName != null && mEditTextFileName.getText() != null) {
            String fileName = mEditTextFileName.getText().toString();
            File textFile = new File(Environment.getExternalStorageDirectory(), fileName);
            if (!fileName.isEmpty() && fileName != null) {
                mTextViewContent.setText("");
                try {
                    mTextViewContent.setText("Read file external = ");
                    mTextViewContent.append(
                            mExternalStorage.readFileExternal(textFile));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    protected boolean isExternalStorageWritable() {
        String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state)) {
            return true;
        }
        return false;
    }

    private boolean checkPermission(int permission) {
        return (permission == PackageManager.PERMISSION_GRANTED);
    }
}
