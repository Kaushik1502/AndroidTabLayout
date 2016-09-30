package com.and.lovelivesmatter.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.and.lovelivesmatter.R;

public class NavigationMenuAdapter extends ArrayAdapter<String>{

    private final Context _context;
    private final int layoutId;
    private final String[] dataList;

    public NavigationMenuAdapter(Context context, int resourceId, String[] objects) {
        super(context, resourceId, objects);
        _context = context;
        layoutId = resourceId;
        dataList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(_context).inflate(layoutId,parent,false);
            viewHolder.navItemTxtView = (TextView) convertView
                    .findViewById(R.id.navItemTxtView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.navItemTxtView.setText(dataList[position]);
        return convertView;
    }

    class ViewHolder {
        TextView navItemTxtView;
    }
}
