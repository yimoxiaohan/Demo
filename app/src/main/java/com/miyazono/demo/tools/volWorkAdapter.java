package com.miyazono.demo.tools;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.miyazono.demo.R;

/**
 * Created by Administrator on 2017/12/24.
 */

public class volWorkAdapter extends BaseAdapter {
    private String[] volwork = {"第一件","第二件"};
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    public volWorkAdapter(Context context){
        mContext = context;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return volwork.length;
    }

    @Override
    public Object getItem(int position) {
        return volwork[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mLayoutInflater.inflate(R.layout.item_volwork,null);
        TextView volworkTextView = convertView.findViewById(R.id.volwork_text_view);
        volworkTextView.setText(volwork[position]);
        return convertView;
    }
}
