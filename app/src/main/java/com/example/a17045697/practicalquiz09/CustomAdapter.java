package com.example.a17045697.practicalquiz09;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<formulaItems> FormulaList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull  ArrayList<formulaItems> objects){
        super(context,resource,objects);

        parent_context = context;
        layout_id = resource;
        FormulaList = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent,false);
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvMethod = rowView.findViewById(R.id.textViewFormula);
        TextView tvType = rowView.findViewById(R.id.textViewtype);
        formulaItems currentItem = FormulaList.get(position);
        tvName.setText(currentItem.getName());
        tvMethod.setText(currentItem.getMethod());
        tvType.setText(currentItem.getType());

        return rowView;
    }
}
