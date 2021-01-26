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

public class SelectedOfferFragment extends Fragment {

    private Button send_offer;

    public SelectedOfferFragment() {}

    public static SelectedOfferFragment newInstance(String param1, String param2) {
        SelectedOfferFragment fragment = new SelectedOfferFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_selected_offer, container, false);

        send_offer = (Button) view.findViewById(R.id.selected_buy);
        return view;
    }
}