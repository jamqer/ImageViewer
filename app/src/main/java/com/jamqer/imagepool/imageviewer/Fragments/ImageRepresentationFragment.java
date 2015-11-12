package com.jamqer.imagepool.imageviewer.Fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.jamqer.imagepool.imageviewer.R;
import com.squareup.picasso.Picasso;

/**
 * A simple {@link Fragment} subclass.
 */
public class ImageRepresentationFragment extends Fragment {

    String [] getDataFromBundleArray = new String[5];
    ImageView imageViewPicture;
    TextView textViewDownloads, textViewLikes,
            textViewHeight,textViewWidth;

    public ImageRepresentationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View inputFragmentView = inflater.inflate(R.layout.fragment_image_representation, container, false);

        imageViewPicture = (ImageView) inputFragmentView.findViewById(R.id.ImageViewMainPicture);

        textViewDownloads= (TextView) inputFragmentView.findViewById(R.id.textViewDownloads);
        textViewLikes = (TextView) inputFragmentView.findViewById(R.id.textViewLikes);
        textViewHeight = (TextView) inputFragmentView.findViewById(R.id.textViewHeight);
        textViewWidth = (TextView) inputFragmentView.findViewById(R.id.textViewWidth);

        setResourcesToLayoutObjects();

        return inputFragmentView;
    }


    private void setResourcesToLayoutObjects(){

        getDataFromBundleArray = getArguments().getStringArray("fetchedDataArray");
        Picasso.with(getActivity()).load(getDataFromBundleArray[0]).fit().into(imageViewPicture);


        textViewLikes.setText("Likes: " + getDataFromBundleArray[1]);
        textViewDownloads.setText("Downloads: " + getDataFromBundleArray[2]);
        textViewHeight.setText("Height: " + getDataFromBundleArray[3] + " px");
        textViewWidth.setText("Width: " + getDataFromBundleArray[4]+ " px");

        Log.v("IMAGES", "Success to get data from Bundle and set to Layout Objects");

    }
}
