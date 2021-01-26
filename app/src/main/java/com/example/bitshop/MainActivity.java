package com.example.bitshop;


import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.bitshop.LoginAndRegister.LogViewPagerAdapter;
import com.example.bitshop.LoginAndRegister.LoginFragment;
import com.example.bitshop.LoginAndRegister.RegisterFragment;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private LogViewPagerAdapter logViewPagerAdapter;
    private TabLayout tabLayoutLogin;
    private ViewPager viewPagerLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPagerLogin = (ViewPager) findViewById(R.id.viewPager);
        tabLayoutLogin = (TabLayout) findViewById(R.id.tabLayout);
        logViewPagerAdapter = new LogViewPagerAdapter(getSupportFragmentManager());
        logViewPagerAdapter.addFragment(new LoginFragment(), "ورود");
        logViewPagerAdapter.addFragment(new RegisterFragment(), "ثبت نام");
        viewPagerLogin.setAdapter(logViewPagerAdapter);
        viewPagerLogin.setBackgroundColor(Color.WHITE);
        tabLayoutLogin.setupWithViewPager(viewPagerLogin);
    }
}
