package com.delaroystudios.swipecards;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyAppAdapter extends BaseAdapter {


    public ArrayList<String> data;
    public Context context;
    public static ViewHolder viewHolder;


    public MyAppAdapter(ArrayList<String> apps, Context context) {
        this.data = apps;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View rowView = convertView;


        if (rowView == null) {

            LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
            rowView = inflater.inflate(R.layout.item, parent, false);
            // configure view holder
            viewHolder = new ViewHolder();
            viewHolder.DataText = (TextView) rowView.findViewById(R.id.bookText);

            rowView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.DataText.setText(data.get(position) + "");


        return rowView;
    }

    public static class ViewHolder {
        public static FrameLayout background;
        public TextView DataText;
        public ImageView cardImage;


    }


}
