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

public class ShaparakFragment extends Fragment {

    private Button send_rial_offer;

    private BaseActivity advertisingActivity;

    public ShaparakFragment() {}

    public static ShaparakFragment newInstance(String param1, String param2) {
        ShaparakFragment fragment = new ShaparakFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shaparak, container, false);

        send_rial_offer = (Button) view.findViewById(R.id.send_rial_offer);
        send_rial_offer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"اعمال شد", Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }
}