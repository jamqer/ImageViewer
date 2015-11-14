package com.jamqer.imagepool.imageviewer.Fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.jamqer.imagepool.imageviewer.API.ImageViewerAPI;
import com.jamqer.imagepool.imageviewer.Adapters.ImageListAdapter;
import com.jamqer.imagepool.imageviewer.Model.ImagesResponse;
import com.jamqer.imagepool.imageviewer.R;
import com.jamqer.imagepool.imageviewer.Utils.Utils;

import java.util.HashMap;
import java.util.Map;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * A simple {@link Fragment} subclass.
 */
public class ImageListFragment extends Fragment {


    String StringToQuery;
    Bundle fetchedDataBundle = new Bundle();
    String [] fetchedDataArray = new String[5];
    ImageListAdapter imageListAdapter;
    Fragment fragment = new ImageRepresentationFragment();

    @Bind(R.id.listViewImages) ListView fetchedImagesList;

    public ImageListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

         View inputFragmentView = inflater.inflate(R.layout.fragment_image_list, container, false);
         ButterKnife.bind(this,inputFragmentView);

        fetchDataAndBindToAdapter();
        return inputFragmentView;
    }


    private void fetchDataAndBindToAdapter() {

        StringToQuery = getArguments().getString("searchKeyword");

        if (StringToQuery != null){

        Retrofit retrofit;

        retrofit = new Retrofit.Builder()
                .baseUrl(Utils.HOST)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ImageViewerAPI imageViewerAPI = retrofit.create(ImageViewerAPI.class);
        Map<String, String> QueryMapAskForQ = new HashMap<String, String>();
            QueryMapAskForQ.put("username", "jamqer");
            QueryMapAskForQ.put("key", "d87019d529c5bc1487c5");
            QueryMapAskForQ.put("q", StringToQuery);
            QueryMapAskForQ.put("image_type", "photo");


        Call<ImagesResponse> call = imageViewerAPI.getResponse(QueryMapAskForQ);
        call.enqueue(new Callback<ImagesResponse>() {
            @Override
            public void onResponse(final Response<ImagesResponse> response) {
                try {
                    imageListAdapter = new ImageListAdapter(getActivity(), response.body().getHits());
                    fetchedImagesList.setAdapter(imageListAdapter);
                    fetchedImagesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            fetchedDataArray[0] = response.body().getHits().get(position).getPreviewURL();
                            fetchedDataArray[1] = String.valueOf(response.body().getHits().get(position).getLikes());
                            fetchedDataArray[2] = String.valueOf(response.body().getHits().get(position).getDownloads());
                            fetchedDataArray[3] = String.valueOf(response.body().getHits().get(position).getImageHeight());
                            fetchedDataArray[4] = String.valueOf(response.body().getHits().get(position).getImageWidth());

                            fetchedDataBundle.putStringArray("fetchedDataArray", fetchedDataArray);
                            fragment.setArguments(fetchedDataBundle);
                            getFragmentManager()
                                    .beginTransaction()
                                    .replace(R.id.container, fragment)
                                    .addToBackStack(null)
                                    .commit();

                        }
                    });
                    Log.v("IMAGES", "Response from API Successed");
                }catch(NullPointerException e){
                    Log.v("IMAGES", "Error" + e.toString());
                }
            }

            @Override
            public void onFailure(Throwable t) {
                Log.v("IMAGES", "Response from API Failed, Error: " + t.toString());
            }
        });


    }}

    @Override
    public void onResume(){
        super.onResume();

        fetchDataAndBindToAdapter();
    }
}
