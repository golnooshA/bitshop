package com.example.bitshop.MyAdvertising;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.bitshop.BaseActivity;
import com.example.bitshop.R;

public class EditAdvertisingFragment extends Fragment {

    private Button edit_my_advertising;
    private EditText currency_torget, currency_source, currency_amount, currency_cost,
            currency_expire_time, currency_explain;

    private Spinner spinner_currency_source, spinner_currency_torget;
    private ArrayAdapter<CharSequence> spinnerArrayAdapter;

    public EditAdvertisingFragment() {}

    public static EditAdvertisingFragment newInstance(String param1, String param2) {
        EditAdvertisingFragment fragment = new EditAdvertisingFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_edit_my_advertising, container, false);

        edit_my_advertising = (Button) view.findViewById(R.id.edit_my_advertising);
        edit_my_advertising.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "اعمال تغییرات", Toast.LENGTH_LONG).show();

            }
        });


        //-------------------spinner-----------------------//
        spinner_currency_source = (Spinner) view.findViewById(R.id.choose_source);
        spinnerArrayAdapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.currency_source__, R.layout.spinner_textview_align_2);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner_currency_source.setAdapter(spinnerArrayAdapter);

        spinner_currency_torget = (Spinner) view.findViewById(R.id.choose_toggle);
        spinnerArrayAdapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.currency_toggle__, R.layout.spinner_textview_align_2);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner_currency_torget.setAdapter(spinnerArrayAdapter);
        //-----------------------------------------------//
        return view;
    }
}