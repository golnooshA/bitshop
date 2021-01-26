package com.example.bitshop.MyAdvertising;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.bitshop.Advertising.AdvertisingDataLists;
import com.example.bitshop.BaseActivity;
import com.example.bitshop.R;

public class MyAdvertisingFragment extends Fragment {

    private RecyclerView recyclerView;
    private MyAdvertisingAdapter adapter;
    //    List<AdvertisingDataLists> advertisingDataLists;
    private AdvertisingDataLists[] advertisingDataLists;

    public MyAdvertisingFragment() {}

    public static MyAdvertisingFragment newInstance(String param1, String param2) {
        MyAdvertisingFragment fragment = new MyAdvertisingFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_advertising, container, false);

        //-----------------recycler-----------------//
        advertisingDataLists = new AdvertisingDataLists[]{
//                new AdvertisingDataLists(R.drawable.image_recycler, "Rial", "BitCoin",
//                        "2000000", "160000000", "2020-01-24", "خریدارم")
//                new AdvertisingDataLists(R.drawable.image_recycler, "Rial", "BitCoin",
//                        "1000000", "152000000", "2020-01-24", "خریدارم")
        };

        recyclerView = (RecyclerView) view.findViewById(R.id.my_advertise_recyclerview);
        adapter = new MyAdvertisingAdapter(advertisingDataLists, getContext(),(BaseActivity) getActivity());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setAdapter(adapter);
        //-------------------------------------------//

        return view;
    }
}
