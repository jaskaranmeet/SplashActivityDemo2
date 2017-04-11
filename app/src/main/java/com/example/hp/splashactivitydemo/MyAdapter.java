package com.example.hp.splashactivitydemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Hp on 14-Mar-17.
 */

public class MyAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<singleRow2> singleRowArrayList1;
    private LayoutInflater inflater;


    public MyAdapter(Context context, ArrayList<SingleRow> singleRowArrayList1) {
        this.context = context;
        this.singleRowArrayList1 = this.singleRowArrayList1;
    }

    @Override
    public int getCount() {
        return singleRowArrayList1.size();
    }

    @Override
    public Object getItem(int position) {
        return singleRowArrayList1.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.singlerow, parent, false);

        //find all views of singlerow.xml
        TextView txtname = (TextView) convertView.findViewById(R.id.txtname);
        TextView txtcontact = (TextView) convertView.findViewById(R.id.txtcontact);
        TextView txtdriver = (TextView) convertView.findViewById(R.id.txtdriver);


        //getting data from adapter

        singleRow2 singleRow = singleRowArrayList1.get(position);
        String name = singleRow.getName();
        String contact = singleRow.getContact();
        String driver = singleRow.getRider();

        //setting data
        txtname.setText(name);
        txtcontact.setText(contact);
        txtdriver.setText(driver);
        return convertView;
    }
}

