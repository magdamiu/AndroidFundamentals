package magdamiu.com.androidfundamentals.week6.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import magdamiu.com.androidfundamentals.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MethodFragment extends Fragment {

    private TextView mTextViewCheckNumber;
    private int mNumber;

    public MethodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bundle, container, false);
        initView(view);

        checkNumber(mNumber);
        return view;
    }

    public void setNumber(int number) {
        this.mNumber = number;
    }

    private void initView(View view) {
        mTextViewCheckNumber = view.findViewById(R.id.textview_check_number);
    }

    private void checkNumber(int number) {
        if (number % 2 == 0) {
            mTextViewCheckNumber.setText("The number is even");
        } else {
            mTextViewCheckNumber.setText("The number is odd");
        }
    }
}
