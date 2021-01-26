package com.example.bitshop.Advertising;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.bitshop.BaseActivity;
import com.example.bitshop.R;

public class AllAdvertisingListFragment extends Fragment {

    private Spinner spinner_source, spinner_torget;
    private ArrayAdapter<CharSequence> spinnerArrayAdapter;
    private String spinnerValue;

    private RecyclerView recyclerView;
    private AdvertisingListAdapter adapter;
    //    List<AdvertisingDataLists> advertisingDataLists;
    private AdvertisingDataLists[] advertisingDataLists;


    public AllAdvertisingListFragment() {
    }

    public static AllAdvertisingListFragment newInstance(String param1, String param2) {
        AllAdvertisingListFragment fragment = new AllAdvertisingListFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_advertising_list, container, false);

        //-----------------spinner--------------------//
        spinner_source = (Spinner) view.findViewById(R.id.currency_source);
        spinnerArrayAdapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.currency_source, R.layout.spinner_textview_);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner_source.setAdapter(spinnerArrayAdapter);

//        spinner_source.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//
//                spinnerValue = (String) spinner_source.getSelectedItem();
//                switch (spinnerValue) {
//
//                    case "Rial":
//                        spinnerArrayAdapter.getFilter().filter(spinnerValue);
//                        spinnerArrayAdapter.notifyDataSetChanged();
//                        break;
//
//                    case "BitCoin":
//
//
//                    case "Ethereum":
//                        ;
//
//                    case "ZedCash":
//                }
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//            }
//        });


        spinner_torget = (Spinner) view.findViewById(R.id.currency_torget);
        spinnerArrayAdapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.currency_toggle, R.layout.spinner_textview_);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner_torget.setAdapter(spinnerArrayAdapter);
        //-------------------------------------------//


        //-----------------recycler-----------------//
        advertisingDataLists = new AdvertisingDataLists[]{
//                new AdvertisingDataLists(R.drawable.image_recycler, "Rial", "BitCoin",
//                        "1000000", "152000000", "2020-01-24", "خریدارم"),
//                new AdvertisingDataLists(R.drawable.image_recycler, "Rial", "BitCoin",
//                        "2000000", "160000000", "2020-01-24", "خریدارم"),
                new AdvertisingDataLists(R.drawable.image_recycler, "Rial", "BitCoin",
                        "500000", "89000000", "2019-09-17", "فروشنده ام"),

                new AdvertisingDataLists(R.drawable.image_recycler, "Rial", "BitCoin",
                        "1000000", "92000000", "2019-12-03", "فروشنده ام"),
//
//                new AdvertisingDataLists(R.drawable.image_recycler, "ZedCash", "Rial",
//                        "1", "168000000", "2019-07-30", "فروشنده ام"),
//
////                new AdvertisingDataLists(R.drawable.image_recycler, "Rial", "Ethereum",
////                        "1000000", "92000000", "2022-11-13", "خریدارم"),
//
//                new AdvertisingDataLists(R.drawable.image_recycler, "BitCoin", "Rial",
//                        "2", "415000000", "2020-12-03", "فروشنده ام")
        };

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);
//        adapter = new AdvertisingListAdapter(advertisingDataLists, (BaseActivity) getActivity());
        adapter = new AdvertisingListAdapter(advertisingDataLists);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setAdapter(adapter);
        //-------------------------------------------//

        return view;
    }
}

