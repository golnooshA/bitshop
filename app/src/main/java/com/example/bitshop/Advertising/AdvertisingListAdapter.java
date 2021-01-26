package com.example.bitshop.Advertising;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bitshop.BaseActivity;
import com.example.bitshop.R;

public class AdvertisingListAdapter extends RecyclerView.Adapter<AdvertisingListAdapter.ViewHolder> {

    //        private List<AdvertisingDataLists> advertisingDataLists;
    private LayoutInflater layoutInflater;
    private AdvertisingDataLists[] advertisingDataLists;
    private BaseActivity baseActivity;

    public AdvertisingListAdapter(AdvertisingDataLists[] advertisingDataLists) {
        this.advertisingDataLists = advertisingDataLists;
//        this.baseActivity = baseActivity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.advertising_data_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        holder.currency_source.setText(advertisingDataLists[position].getCurrency_source());
        holder.currency_torget.setText(advertisingDataLists[position].getCurrency_torget());
        holder.currency_amount.setText(advertisingDataLists[position].getCurrency_amount());
        holder.currency_cost.setText(advertisingDataLists[position].getCurrency_cost());
        holder.currency_expire_time.setText(advertisingDataLists[position].getCurrency_expire_time());
        holder.explain.setText(advertisingDataLists[position].getExplain());
        holder.imageView.setImageResource(advertisingDataLists[position].getImage());
        holder.selected_buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "ارسال درخواست", Toast.LENGTH_LONG).show();
            }
        });
//        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                baseActivity.ChangeFragment();
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return advertisingDataLists.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView currency_source, currency_torget, currency_amount,
                currency_cost, currency_expire_time, explain;
        private ImageView imageView;
        public LinearLayout linearLayout;
        private Button selected_buy;

        public ViewHolder(View itemView) {
            super(itemView);
            this.currency_source = (TextView) itemView.findViewById(R.id.source_name);
            this.currency_torget = (TextView) itemView.findViewById(R.id.torget_name);
            this.currency_amount = (TextView) itemView.findViewById(R.id.currency_amount);
            this.currency_cost = (TextView) itemView.findViewById(R.id.currency_cost);
            this.currency_expire_time = (TextView) itemView.findViewById(R.id.expire_time);
            this.explain = (TextView) itemView.findViewById(R.id.explain);
            this.imageView = (ImageView) itemView.findViewById(R.id.image);
            this.selected_buy = (Button) itemView.findViewById(R.id.selected_buy);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.linearLayout);
        }
    }
}
