package com.example.bitshop.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.bitshop.BaseActivity;
import com.example.bitshop.R;


public class OfferFragment extends Fragment {

    private Spinner spinner_currency_source, spinner_currency_torget;
    private ArrayAdapter<CharSequence> spinnerArrayAdapter;
    private String SpinnerValue;

    private Button sent_offer, increase_credit;

    private BaseActivity advertisingActivity;
    private FrameLayout frameLayout;


    public static BaseActivity baseActivity;

    public OfferFragment(BaseActivity baseActivity) {
        this.baseActivity = baseActivity;

    }

    public static OfferFragment newInstance(String param1, String param2) {
        OfferFragment fragment = new OfferFragment(baseActivity);
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_advertising_offer, container, false);

        //-------------------spinner-----------------------//
        spinner_currency_source = (Spinner) view.findViewById(R.id.choose_source);
        spinnerArrayAdapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.currency_source, R.layout.spinner_textview_align);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner_currency_source.setAdapter(spinnerArrayAdapter);
        spinner_currency_source.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                SpinnerValue = (String) spinner_currency_source.getSelectedItem();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        sent_offer = (Button) view.findViewById(R.id.send_offer);
        sent_offer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                switch (SpinnerValue) {

                    case "Rial":
                        baseActivity.ChangeToShaparak();
                        break;

                    case "BitCoin":
                        baseActivity.ChangeToNoRial();
                        break;

                    case "Ethereum":
                        baseActivity.ChangeToNoRial();
                        break;

                    case "ZedCash":
                        baseActivity.ChangeToNoRial();
                        break;
                }
            }
        });

        spinner_currency_torget = (Spinner) view.findViewById(R.id.choose_toggle);
        spinnerArrayAdapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.currency_toggle, R.layout.spinner_textview_align);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner_currency_torget.setAdapter(spinnerArrayAdapter);
        //-----------------------------------------------//


        increase_credit = (Button) view.findViewById(R.id.increase_credit);
        increase_credit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                switch (SpinnerValue) {

                    case "Rial":
                        baseActivity.ChangeToShaparak();
                        break;

                    case "BitCoin":
                        baseActivity.ChangeToNoRial();
                        break;

                    case "Ethereum":
                        baseActivity.ChangeToNoRial();
                        break;

                    case "ZedCash":
                        baseActivity.ChangeToNoRial();
                        break;
                }
            }
        });

        return view;
    }
}