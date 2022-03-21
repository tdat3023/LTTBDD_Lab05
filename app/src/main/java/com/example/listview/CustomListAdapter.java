package com.example.listview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomListAdapter extends BaseAdapter {
    private List<Cake> listData;
    private int layout;
    private Context context;
    //private int positionSelect = -1;

    public CustomListAdapter(List<Cake> listData, int layout, Context context) {
        this.listData = listData;
        this.layout = layout;
        this.context = context;
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        convertView = layoutInflater.inflate(layout, null);
        Cake cake = listData.get(i);

        TextView cakeName = convertView.findViewById(R.id.tv_ten_banh);
        TextView cakeDescription = convertView.findViewById(R.id.tv_banh_description);
        TextView cakeCost = convertView.findViewById(R.id.tv_gia);
        ImageView cakeImage = convertView.findViewById(R.id.image_flag);

        cakeName.setText(cake.getName());
        cakeDescription.setText(cake.getDescription());
        cakeCost.setText(String.valueOf(cake.getCost()));
        cakeImage.setImageResource(cake.getFlagName());

//        convertView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //Toast.makeText(context, cake.getName(), Toast.LENGTH_SHORT).show();
//                Toast.makeText(context, String.valueOf(i), Toast.LENGTH_SHORT).show();
//            }
//        });

        return convertView;
    }

}
