package com.example.asus.norouzi;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class PhoneAdapter extends ArrayAdapter<Phone> {

    private Context context;
    private List<Phone> objects;

    public PhoneAdapter(Context context, int resource, List<Phone> objects) {
        super(context, resource, objects);
        this.context = context;
        this.objects = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Phone phone = objects.get(position);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.item_phone, null);

        ImageView image = (ImageView) view.findViewById(R.id.imageView2);
        image.setImageResource(phone.imageResource);

        TextView tv = (TextView) view.findViewById(R.id.textView3);
        tv.setText(phone.phoneName);

        return view;
    }
}
