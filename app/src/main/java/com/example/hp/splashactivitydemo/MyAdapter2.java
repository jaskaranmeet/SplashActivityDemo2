package com.example.hp.splashactivitydemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Hp on 09-Apr-17.
 */

public class MyAdapter2 extends BaseAdapter {

    private Context context;
    private ArrayList<singleRow2> singleRowArrayList;
    private LayoutInflater inflater;


    public MyAdapter2(Context context, ArrayList<singleRow2> singleRowArrayList) {
        this.context = context;
        this.singleRowArrayList = singleRowArrayList;
    }

    @Override
    public int getCount() {
        return singleRowArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return singleRowArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.activity_single_row2, parent, false);

        //find all views of singlerow.xml
        TextView txtname = (TextView) convertView.findViewById(R.id.txtname);
        TextView txtcontact = (TextView) convertView.findViewById(R.id.txtcontact);
        TextView txtrider = (TextView) convertView.findViewById(R.id.txtrider);


        //geeting data from adapter

        singleRow2 singleRow2 = singleRowArrayList.get(position);
        String name = singleRow2.getName();
        String contact = singleRow2.getContact();
        String rider = singleRow2.getRider();

        //setting data
        txtname.setText(name);
        txtcontact.setText(contact);
        txtrider.setText(rider);
        return convertView;
    }
}
