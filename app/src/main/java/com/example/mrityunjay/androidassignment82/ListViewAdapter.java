package com.example.mrityunjay.androidassignment82;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Mrityunjay on 18-05-2017.
 */

public class ListViewAdapter extends BaseAdapter {//extended baseAdapter
    Context context;
    ArrayList<CustomHandler>data;// arraylist
    LayoutInflater inflater;
    public ListViewAdapter (Context context,ArrayList<CustomHandler>data){
        this.context=context;
        this.data=data;
        inflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);// inflator

    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {

            convertView = inflater.inflate(R.layout.row, parent, false);
            holder = new ViewHolder();
            holder.text1 = (TextView) convertView.findViewById(R.id.text1);
            holder.text2 = (TextView) convertView.findViewById(R.id.text2);
            convertView.setTag(holder);

        }
        else {
            holder=(ViewHolder)convertView.getTag();
        }
        holder.text1.setText(data.get(position).getName());
        holder.text2.setText(data.get(position).getPn());
        return convertView;
    }
    public  class ViewHolder{
        TextView text1;
        TextView text2;
    }
}

