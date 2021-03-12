package com.example.listviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomGoodsAdapter extends BaseAdapter {
    public CustomGoodsAdapter(Context ctx, int layoutItem, ArrayList<Goods> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    Context ctx;
    int layoutItem;
    ArrayList<Goods> arrayList;
    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(ctx).inflate(layoutItem, parent, false);
        TextView txtName=convertView.findViewById(R.id.txtName);
        TextView txtShop=convertView.findViewById(R.id.txtShop);
        ImageView imgGoods=convertView.findViewById(R.id.imgGoods);
        //
        txtName.setText(arrayList.get(position).getName());
        txtShop.setText(arrayList.get(position).getShop_name());
        imgGoods.setImageResource(arrayList.get(position).getImgGoods());
        return convertView;
    }
}
