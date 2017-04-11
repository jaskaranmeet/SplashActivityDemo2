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


public class Request extends AppCompatActivity {
    private singleRow2 singleRow2;
    private ArrayList<singleRow2> singleRowArrayList1;
    private ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);


        //   registerForContextMenu(lv);

        lv = (ListView) findViewById(R.id.lv);

        String name[] = {"raj", "as", "asd", "dhsk", "dsha", "dyds", "dsfe", "gdj", "xsbahd", "fgf"};
        String contact[] = {"this is desc", "this is desc", "this is desc", "this is desc", "this is desc", "this is desc", "this is desc", "this is desc", "this is desc", "this is desc"};
        String rider[] = {"Rider1", "Rider2", "Rider3", "Rider4", "Rider5", "Rider6", "Rider7", "Rider8", "Rider9", "Rider10"};

        singleRowArrayList1 = new ArrayList<>();
        for (int i = 0; i < name.length; i++) {
            singleRow2 = new singleRow2(rider[i], name[i], contact[i]);
            singleRowArrayList1.add(singleRow2);
        }
        MyAdapter2 adapter1 = new MyAdapter2(this, singleRowArrayList1);
        lv.setAdapter(adapter1);

    }

    public void showPopup(View v) {
        PopupMenu popupMenu = new PopupMenu(this, v);
        MenuInflater inflater = popupMenu.getMenuInflater();
        inflater.inflate(R.menu.menu_main2,popupMenu.getMenu());
        popupMenu.show();

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.confirm:
                        Toast.makeText(Request.this, "Request Confirmed", Toast.LENGTH_LONG).show();
                        return true;

                    case R.id.desc:
                        Toast.makeText(Request.this, "Contact No. is", Toast.LENGTH_LONG).show();
                        return true;

                    case R.id.decline:
                        Toast.makeText(Request.this, "Request declined", Toast.LENGTH_LONG).show();
                        return true;

                    default:
                        return false;

                }
            }
        });
    }

}