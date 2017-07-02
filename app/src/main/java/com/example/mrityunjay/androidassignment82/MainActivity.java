package com.example.mrityunjay.androidassignment82;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView list;
    String name[]={"mj","dj","osama","raju"};
    String pn[]={"994534444","95327255","54795222","4562178"};
ArrayList<CustomHandler> model=new ArrayList<>();// object
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=(ListView)findViewById(R.id.list);
        for (int i=0;i<name.length;i++){
            CustomHandler handler=new CustomHandler();// calling customhandler
            handler.setName(name[i]);
            handler.setPn(pn[i]);
            model.add(handler);
        }
        ListViewAdapter adapter=new ListViewAdapter(this,model);// adapter
        list.setAdapter(adapter);// setadapter



    }
}
