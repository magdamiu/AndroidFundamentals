package magdamiu.com.androidfundamentals.week4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import magdamiu.com.androidfundamentals.R;

public class SpinnerActivity extends AppCompatActivity implements AdapterView
        .OnItemSelectedListener {

    private Spinner mSpinnerAndroid;
    private List<String> mDataSourceSpinner;
    private ArrayAdapter<String> mAdapterSpinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        //data source
        mDataSourceSpinner = getSource();

        //adapter
        mAdapterSpinner = getAdapter();

        //spinner
        mSpinnerAndroid = findViewById(R.id.spinner_android);

        //set the adapter to the spinner
        mSpinnerAndroid.setAdapter(mAdapterSpinner);

        //set on item selected listener
        mSpinnerAndroid.setOnItemSelectedListener(this);

        //set a default value
        mSpinnerAndroid.setPrompt(getString(R.string.default_value_spinner));
    }

    private List<String> getSource() {
        List<String> androids = new ArrayList<String>();
        androids.add("Cupcake");
        androids.add("Donut");
        androids.add("Eclair");
        androids.add("KitKat");
        androids.add("Pie");
        return androids;
    }

    private ArrayAdapter<String> getAdapter() {
        return new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,
                mDataSourceSpinner);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        //get the selected item
        String item = adapterView.getItemAtPosition(i).toString();

        //display the content of the selected item
        Toast.makeText(adapterView.getContext(), "Selected: " + item, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
