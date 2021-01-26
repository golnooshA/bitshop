package com.example.bitshop.MyAdvertising;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bitshop.Advertising.AdvertisingDataLists;
import com.example.bitshop.BaseActivity;
import com.example.bitshop.R;

public class MyAdvertisingAdapter extends RecyclerView.Adapter<MyAdvertisingAdapter.ViewHolder> {

    //        private List<AdvertisingDataLists> advertisingDataLists;
    private LayoutInflater layoutInflater;
    private AdvertisingDataLists[] advertisingDataLists;
    private Context context;
    private BaseActivity baseActivity;


    public MyAdvertisingAdapter(AdvertisingDataLists[] advertisingDataLists, Context context, BaseActivity baseActivity) {
        this.advertisingDataLists = advertisingDataLists;
        this.context = context;
        this.baseActivity = baseActivity;
    }

    @NonNull
    @Override
    public MyAdvertisingAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.my_advertising_data, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

        holder.currency_source.setText(advertisingDataLists[position].getCurrency_source());
        holder.currency_torget.setText(advertisingDataLists[position].getCurrency_torget());
        holder.currency_amount.setText(advertisingDataLists[position].getCurrency_amount());
        holder.currency_cost.setText(advertisingDataLists[position].getCurrency_cost());
        holder.currency_expire_time.setText(advertisingDataLists[position].getCurrency_expire_time());
        holder.explain.setText(advertisingDataLists[position].getExplain());
        holder.imageView.setImageResource(advertisingDataLists[position].getImage());
        holder.menu_bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(context, holder.menu_bar);
                popup.inflate(R.menu.recycler_menu);
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {

                            case R.id.edit:
                                baseActivity.EditAdvertising();
                                break;

                            case R.id.delete:
                                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                                builder.setTitle("حذف آگهی")
                                        .setMessage("آیا تمایل به حذف این گزینه دارید؟")
                                        .setCancelable(false)
                                        .setPositiveButton("بله", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
//                                                Toast.makeText(context, "آگهی حذف شد", Toast.LENGTH_SHORT).show();
                                                notifyItemRemoved(position);
                                            }
                                        })
                                        .setNegativeButton("خیر", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                            }
                                        });
                                AlertDialog dialog = builder.create();
                                dialog.show();

                                break;
                        }
                        return false;
                    }
                });
                popup.show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return advertisingDataLists.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView currency_source, currency_torget, currency_amount,
                currency_cost, currency_expire_time, explain;
        private ImageView imageView;
        private LinearLayout linearLayout;
        final ImageView menu_bar;

        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.image);
            this.currency_source = (TextView) itemView.findViewById(R.id.source_name);
            this.currency_torget = (TextView) itemView.findViewById(R.id.torget_name);
            this.currency_amount = (TextView) itemView.findViewById(R.id.currency_amount);
            this.currency_cost = (TextView) itemView.findViewById(R.id.currency_cost);
            this.currency_expire_time = (TextView) itemView.findViewById(R.id.expire_time);
            this.explain = (TextView) itemView.findViewById(R.id.explain);
            this.menu_bar = (ImageView) itemView.findViewById(R.id.menu_bar);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.linearLayout);
        }
    }
}
