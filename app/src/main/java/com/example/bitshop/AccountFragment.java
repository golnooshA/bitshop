package com.example.bitshop;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class AccountFragment extends Fragment {

    private Button rial_cash, bitcoin_cash, zedcash_cash, etherum_cash;

    public AccountFragment() {}

    public static AccountFragment newInstance(String param1, String param2) {
        AccountFragment fragment = new AccountFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_account, container, false);

        rial_cash = (Button) view.findViewById(R.id.rial_recive);
        rial_cash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "ارسال درخواست دریافت وجه ریالی", Toast.LENGTH_LONG).show();
            }
        });

        bitcoin_cash = (Button) view.findViewById(R.id.bitCoin_recive);
        bitcoin_cash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "ارسال درخواست دریافت وجه غیر ریالی", Toast.LENGTH_LONG).show();
            }
        });

        etherum_cash = (Button) view.findViewById(R.id.ethereum_recive);
        etherum_cash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "ارسال درخواست دریافت وجه غیر ریالی", Toast.LENGTH_LONG).show();
            }
        });

        zedcash_cash = (Button) view.findViewById(R.id.zedcash_recive);
        zedcash_cash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "ارسال درخواست دریافت وجه غیر ریالی", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}