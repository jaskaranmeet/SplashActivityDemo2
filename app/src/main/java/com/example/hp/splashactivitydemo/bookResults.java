package com.example.hp.splashactivitydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class bookResults extends AppCompatActivity {
    private SingleRow singleRow;
    private ArrayList<SingleRow> singleRowArrayList;
    private ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_results);


        //   registerForContextMenu(lv);

        lv = (ListView) findViewById(R.id.lv);

        String name[] = {"raj", "as", "asd", "dhsk", "dsha", "dyds", "dsfe", "gdj", "xsbahd", "fgf"};
        String contact[] = {"this is desc", "this is desc", "this is desc", "this is desc", "this is desc", "this is desc", "this is desc", "this is desc", "this is desc", "this is desc"};
        String driver[] = {"Driver1", "Driver2", "Driver3", "Driver4", "Driver5", "Driver6", "Driver7", "Driver8", "Driver9", "Driver10"};

        singleRowArrayList = new ArrayList<>();
        for (int i = 0; i < name.length; i++) {
            singleRow = new SingleRow(driver[i], name[i], contact[i]);
            singleRowArrayList.add(singleRow);
        }
        MyAdapter adapter = new MyAdapter(this, singleRowArrayList);
        lv.setAdapter(adapter);

    }

    public void showPopup(View v) {
        PopupMenu popupMenu = new PopupMenu(this, v);
        MenuInflater inflater = popupMenu.getMenuInflater();
        inflater.inflate(R.menu.menu_main,popupMenu.getMenu());
        popupMenu.show();

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.rqst:
                        Toast.makeText(bookResults.this, "Request Sent", Toast.LENGTH_LONG).show();
                        return true;

                    case R.id.desc:
                        Toast.makeText(bookResults.this, "Contact No. is", Toast.LENGTH_LONG).show();
                        return true;

                    default:
                        return false;

                }
            }
        });
    }

}