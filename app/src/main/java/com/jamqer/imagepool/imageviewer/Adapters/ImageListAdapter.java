package com.jamqer.imagepool.imageviewer.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.jamqer.imagepool.imageviewer.Model.Images;
import com.jamqer.imagepool.imageviewer.R;
import com.squareup.picasso.Picasso;


import java.util.List;

/**
 * Created by Piotras on 2015-10-26.
 List adapter with custom item layout/listview_item/.
 Fits records from Pixabay.*/
public class ImageListAdapter extends BaseAdapter {

    private final Context context;
    private final List<Images> ListOfImages;

    public ImageListAdapter(Context context, List<Images> listOfImages) {
        this.context = context;
        ListOfImages = listOfImages;

    }


    @Override
    public int getCount() {
        return ListOfImages.size();
    }

    @Override
    public Object getItem(int position) {
        return ListOfImages.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view;

        if(convertView == null){
            view = LayoutInflater.from(context).inflate(R.layout.listview_item, parent, false);
        }else view = convertView;

        TextView textViewFirst = (TextView) view.findViewById(R.id.firstLine);
        TextView textViewSecond = (TextView) view.findViewById(R.id.secondLine);
        ImageView imageView = (ImageView) view.findViewById(R.id.icon);

       // Log.v("ImageViewer", "TextView : " + ListOfImages.get(position));
        textViewFirst.setText("Views: " + ListOfImages.get(position).getViews());
        textViewSecond.setText("Likes: " + ListOfImages.get(position).getLikes());
        Picasso.with(context).load(ListOfImages.get(position).getPreviewURL()).resize(80,80).into(imageView);


        return view;
    }
}