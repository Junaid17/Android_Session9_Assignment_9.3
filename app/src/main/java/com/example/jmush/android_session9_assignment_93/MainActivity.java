package com.example.jmush.android_session9_assignment_93;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] name={ "Junaid", "Sourabh","Anil","Malik","Prateek"};
    String[] phone={"12345","56789","12345","12345","1234567"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomList adapter=new CustomList(this,name,phone);
        listView=(ListView) findViewById(R.id.list_item);
        listView.setAdapter(adapter);
        registerForContextMenu(listView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Select The Action");
        menu.add(0, v.getId(), 0, "Call");
        menu.add(0, v.getId(), 0, "SMS");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        if(item.getTitle()=="Call"){
            Toast.makeText(getApplicationContext(),"Call Clicked",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="SMS"){
            Toast.makeText(getApplicationContext(),"SMS Clicked",Toast.LENGTH_LONG).show();
        }
        return true;
    }
}
