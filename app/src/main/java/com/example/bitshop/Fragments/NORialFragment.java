package com.example.bitshop.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.bitshop.BaseActivity;
import com.example.bitshop.R;

public class NORialFragment extends Fragment {

    private BaseActivity advertisingActivity;
    private Button send_no_rial_offer;


    public NORialFragment() {}

    public static NORialFragment newInstance(String param1, String param2) {
        NORialFragment fragment = new NORialFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_no_rial, container, false);

        send_no_rial_offer = (Button) view.findViewById(R.id.send_no_rial_offer);
        send_no_rial_offer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"اعمال شد", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}