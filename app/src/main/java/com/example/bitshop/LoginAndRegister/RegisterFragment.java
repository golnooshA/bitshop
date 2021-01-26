package com.example.bitshop.LoginAndRegister;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.bitshop.BaseActivity;
import com.example.bitshop.R;


public class RegisterFragment extends Fragment{

        private Button regiester_button;

        @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.register_fragment_layout, container, false);

        regiester_button = (Button) view.findViewById(R.id.register_button);
        regiester_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"ثبت نام انجام شد", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(getActivity(), BaseActivity.class);
//                getActivity().startActivity(intent);
            }
        });

        return view;
    }
}