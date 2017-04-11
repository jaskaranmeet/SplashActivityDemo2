package com.example.hp.splashactivitydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class singleRow2  {

    private String rider,name,contact;


    public singleRow2(String rider, String name, String contact) {
        this.rider=rider;
        this.name = name;
        this.contact = contact;

    }

    public String getRider() {
        return rider;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }
}
