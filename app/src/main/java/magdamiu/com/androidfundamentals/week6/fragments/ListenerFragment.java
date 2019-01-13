package magdamiu.com.androidfundamentals.week6.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import magdamiu.com.androidfundamentals.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListenerFragment extends Fragment {

    private EditText mEditTextFirstNumber;
    private EditText mEditTextSecondNumber;
    private Button mButtonSendSum;

    public ListenerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_listener, container, false);
        initView(view);
        return view;
    }

    private int getBundleData() {
        int number = 0;
        Bundle bundle = getArguments();
        if (bundle != null) {
            number = bundle.getInt(BundleFragmentActivity.NUMBER, 0); // Assigned a default value as well
        }
        return number;
    }

    private void initView(View view) {
        mEditTextFirstNumber = view.findViewById(R.id.edittext_first_number);
        mEditTextSecondNumber = view.findViewById(R.id.edittext_second_number);
        mButtonSendSum = view.findViewById(R.id.button_send_sum);
        mButtonSendSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendNumbers();
            }
        });
    }

    private void sendNumbers() {
        if (mEditTextFirstNumber != null && mEditTextSecondNumber != null) {
            if (mEditTextFirstNumber.getText() != null && mEditTextSecondNumber.getText() != null) {
                String contentInput1 = mEditTextFirstNumber.getText().toString();
                String contentInput2 = mEditTextSecondNumber.getText().toString();
                int firstNumber = Integer.parseInt(contentInput1);
                int secondNumber = Integer.parseInt(contentInput2);
                FragmentListener fragmentListener = (FragmentListener) getActivity();
                fragmentListener.addTwoNumbers(firstNumber, secondNumber);
            }
        } else {
            mEditTextFirstNumber.setError(getString(R.string.missing_number_error));
            mEditTextSecondNumber.setError(getString(R.string.missing_number_error));
        }
    }
}
