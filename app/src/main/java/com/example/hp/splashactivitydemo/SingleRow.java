package com.example.hp.splashactivitydemo;

/**
 * Created by Hp on 06-Apr-17.
 */

public class SingleRow {
    private String driver,name,contact;


    public SingleRow(String driver, String name, String contact) {
        this.driver=driver;
        this.name = name;
        this.contact = contact;

    }

    public String getDriver() {
        return driver;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }


}