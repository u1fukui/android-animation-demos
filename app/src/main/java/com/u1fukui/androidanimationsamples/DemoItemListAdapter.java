package com.u1fukui.androidanimationsamples;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class DemoItemListAdapter extends ArrayAdapter<DemoItem> {

    private LayoutInflater inflater;

    public DemoItemListAdapter(Context context, ArrayList<DemoItem> itemList) {
        super(context, 0, itemList);
        this.inflater = LayoutInflater.from(context);
    }
    
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(android.R.layout.simple_list_item_1, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        DemoItem item = getItem(position);
        holder.titleView.setText(item.getDisplayName());
        return convertView;
    }

    private static class ViewHolder {
        TextView titleView;

        public ViewHolder(View view) {
            this.titleView = (TextView) view.findViewById(android.R.id.text1);
        }
    }
}
