package com.example.bitshop.More;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.bitshop.BaseActivity;
import com.example.bitshop.MainActivity;
import com.example.bitshop.R;

public class MoreFragment extends Fragment {

    private TextView edit_information, exit_app, connect_support;
    private AlertDialog dialogChangePass;

    public static final String USER_PREFERENCES_NAME = "UserInfo";
    public static final String USER_PREFERENCES_USER_ID = "userId";
    public static int MOBILE_WIGHT, MOBILE_HEIGHT;


    public MoreFragment() {
    }

    public static MoreFragment newInstance(String param1, String param2) {
        MoreFragment fragment = new MoreFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_more_option, container, false);

        edit_information = (TextView) view.findViewById(R.id.edit_information);
        edit_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(getActivity());
                View mView = getLayoutInflater().inflate(R.layout.alert_dialog_edit_user_pass, null);
                final EditText mUsername = (EditText) mView.findViewById(R.id.edit_username);
                final EditText mPassword = (EditText) mView.findViewById(R.id.edit_password);
                final EditText mPasswordRepeat = (EditText) mView.findViewById(R.id.edit_password_repeat);
                Button mLogin = (Button) mView.findViewById(R.id.btnLogin);
                mBuilder.setView(mView);
                final AlertDialog dialog = mBuilder.create();
                dialog.show();
                mLogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (!mUsername.getText().toString().isEmpty() && !mPassword.getText().toString().isEmpty()) {
                            Toast.makeText(getActivity(), "تغییرات موفقیت آمیز بود", Toast.LENGTH_SHORT).show();
                            dialog.dismiss();
                        } else {
                            Toast.makeText(getActivity(), "خطایی رخ داده است", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });


        connect_support = (TextView) view.findViewById(R.id.connection_support);
        connect_support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                String temp = "تماس با:" + "009831234567";
                intent.setData(Uri.parse(temp));
                startActivity(intent);
            }
        });

        exit_app = (TextView) view.findViewById(R.id.exit);
        exit_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(), MainActivity.class);
//                startActivity(intent);

                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("پیام خروج از برنامه")
                        .setMessage("آیا تمایل به خروج از برنامه دارید؟")
                        .setCancelable(false)
                        .setPositiveButton("بله", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getActivity(), "خروج از برنامه", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getActivity(), MainActivity.class);
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("خیر", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getActivity(), "خارج نشدید", Toast.LENGTH_SHORT).show();
                            }
                        });
                //Creating dialog box
                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });
        return view;
    }
}


