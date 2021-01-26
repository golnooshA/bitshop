package com.example.bitshop;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.bitshop.Advertising.AllAdvertisingListFragment;
import com.example.bitshop.Fragments.NORialFragment;
import com.example.bitshop.Fragments.OfferFragment;
import com.example.bitshop.Fragments.ShaparakFragment;
import com.example.bitshop.More.MoreFragment;
import com.example.bitshop.MyAdvertising.EditAdvertisingFragment;
import com.example.bitshop.MyAdvertising.MyAdvertisingFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BaseActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_acticity);
        loadFragment(new AllAdvertisingListFragment());


        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bnvMenu);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.all_advertis:
                        loadFragment(new AllAdvertisingListFragment());
                        break;

                    case R.id.set_offer:
                        loadFragment(new OfferFragment(BaseActivity.this));
                        break;

                    case R.id.my_advertise:
                        loadFragment(new MyAdvertisingFragment());
                        break;

                    case R.id.account:
                        loadFragment(new AccountFragment());
                        break;

                    case R.id.more_option:
                        loadFragment(new MoreFragment());
                        break;

                }
                return true;
            }
        });
    }

    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.flContainer, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    public void EditAdvertising() {
        FrameLayout fl = findViewById(R.id.flContainer);
        getSupportFragmentManager().beginTransaction().replace(R.id.flContainer, new EditAdvertisingFragment()).addToBackStack("").commit();
    }

    public void ChangeToShaparak() {
        FrameLayout fl = findViewById(R.id.flContainer);
        getSupportFragmentManager().beginTransaction().replace(R.id.flContainer, new ShaparakFragment()).addToBackStack("").commit();
    }

    public void ChangeToNoRial() {
        FrameLayout fl = findViewById(R.id.flContainer);
        getSupportFragmentManager().beginTransaction().replace(R.id.flContainer, new NORialFragment()).addToBackStack("").commit();
    }

//    public void ChangeFragment(){
//        FrameLayout fl = findViewById(R.id.flContainer);
//        getSupportFragmentManager().beginTransaction().replace(R.id.flContainer, new SelectedOfferFragment()).addToBackStack("").commit();
//    }
}