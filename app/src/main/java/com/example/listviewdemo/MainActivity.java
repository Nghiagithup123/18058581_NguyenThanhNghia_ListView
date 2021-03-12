package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvwGoods;
    CustomGoodsAdapter adt;
    ArrayList<Goods> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvwGoods = findViewById(R.id.lvwGoods);
        arrayList = new ArrayList<Goods>();
        arrayList.add(new Goods("Áo phong đen","Ken shop",R.drawable.a_teveloper_tester_can_never_be_friend));
        arrayList.add(new Goods("Áo phong đen","Ken shop",R.drawable.a_teveloper_tester_can_never_be_friend));
        adt=new CustomGoodsAdapter(this, R.layout.item_listview,arrayList);
        lvwGoods.setAdapter(adt);
    }
}