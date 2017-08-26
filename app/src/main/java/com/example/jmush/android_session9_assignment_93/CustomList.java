package com.example.jmush.android_session9_assignment_93;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by jmush on 8/26/17.
 */

public class CustomList extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] name;
    private final String[] phone;
    TextView textName,txtPhone;

    public CustomList(Activity context,
                      String[] name, String[] phone) {
        super(context, R.layout.custom_list, name);
        this.context = context;
        this.name = name;
        this.phone = phone;
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater=context.getLayoutInflater();
        View rowView=layoutInflater.inflate(R.layout.custom_list,null,true);

        textName= (TextView) rowView.findViewById(R.id.name);
        txtPhone= (TextView) rowView.findViewById(R.id.phone);

        textName.setText(name[position]);
        txtPhone.setText(phone[position]);

        return rowView;
    }
}
