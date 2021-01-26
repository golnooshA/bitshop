package com.example.bitshop.LoginAndRegister;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.bitshop.BaseActivity;
import com.example.bitshop.R;

public class LoginFragment extends Fragment {

    private Button login_button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.login_fragment_layout, container, false);

        login_button = (Button) view.findViewById(R.id.login_button);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"به سیستم خوش آمدید", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getActivity(), BaseActivity.class);
                getActivity().startActivity(intent);
            }
        });

        return view;
    }
}