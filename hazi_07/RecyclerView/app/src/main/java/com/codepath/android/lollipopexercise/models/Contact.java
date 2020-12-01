package com.codepath.android.lollipopexercise.models;

import com.codepath.android.lollipopexercise.R;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// Container class to hold Contact information.
public class Contact implements Serializable {
    private String mName;
    private String info;
    private  int img;

    public Contact(String mName,  int img,String info) {
        this.mName = mName;
        this.img = img;
        this.info = info;
    }

    public String getName() {
        return mName;
    }

    public String getInfo() {
        return info;
    }

    public int getImg() {
        return img;
    }

    // Returns a list of contacts
    public static List<Contact> getContacts() {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Rabbit", R.drawable.rabbit, "4153508881"));
        contacts.add(new Contact("Sheep", R.drawable.sheep, "4153508882"));
        contacts.add(new Contact("Octopus", R.drawable.octopus, "4153508883"));
        contacts.add(new Contact("Cat", R.drawable.cat, "4153508884"));
        contacts.add(new Contact("Lion", R.drawable.lion, "4153508885"));
        contacts.add(new Contact("Sheep", R.drawable.sheep, "4153508886"));
        contacts.add(new Contact("Dog", R.drawable.dog, "4153508887"));
        contacts.add(new Contact("Horse", R.drawable.horse, "4153508888"));
        return contacts;
    }


}
