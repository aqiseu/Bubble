package com.android.intermed.tugas1.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.android.intermed.tugas1.R;
import com.android.intermed.tugas1.adapter.Bubble1Adapter;
import com.android.intermed.tugas1.model.Bubble1Model;

import java.util.ArrayList;


public class Tab1Fragment extends Fragment {



    public Tab1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tab1, container, false);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ListView lvItem;
        ArrayList listItem;

        String[][] itemname ={
                {"Green Tea","15.000"},
                {"Apple Tea","13.000"},
                {"Pineapple Tea","12.000"},
                {"Thai Tea","16.000"},
                {"Taro Tea","12.000"},
                {"Strawberry Tea","15.000"},
                {"Chocolate Tea","15.000"}
        };

        Integer[] imgid={
                R.drawable.greentea,
                R.drawable.appletea,
                R.drawable.pineappletea,
                R.drawable.thaitea,
                R.drawable.tarotea,
                R.drawable.strawberrytea,
                R.drawable.chocolatetea
        };
        ListView lvItem = (ListView) getActivity().findViewById(R.id.item_list);
        lvItem.setAdapter(new ArrayAdapter(getActivity(), R));

        lvItem = (ListView)findViewById(R.id.item_list);
                listItem = new ArrayList<>();

        Bubble1Model bubble = null;

        for (int i = 0; i < itemname.length; i++){
        bubble = new Bubble1Model();
        bubble.setTitle(itemname[i][0]);
        bubble.setHarga(itemname[i][1]);
        bubble.setImage(imgid[i][0]);


        listItem.add(bubble);
        }

        Bubble1Adapter adapter = new Bubble1Adapter(Tab1Fragment.this, listItem);
        lvItem.setAdapter(adapter);

        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
@Override
public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Bubble1Model babel = (Bubble1Model) listItem.get(position);

        Intent intent = new Intent(Tab1Fragment.this, DetailMobilActivity.class);
        intent.putExtra(DetailMobilActivity.KEY_ITEM, babel);
        startActivityForResult(intent, 0);
        }
        });





