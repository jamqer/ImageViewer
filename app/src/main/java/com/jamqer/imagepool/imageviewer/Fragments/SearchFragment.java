package com.jamqer.imagepool.imageviewer.Fragments;


import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.jamqer.imagepool.imageviewer.R;


/**
 *
 */
public class SearchFragment extends Fragment{

    Fragment fragment = new ImageListFragment();
    Bundle sendDataToFragment = new Bundle();
    Button  BtnSearch;
    EditText EditTkeyword;

    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View inputFragmentView = inflater.inflate(R.layout.fragment_search, container, false);
        BtnSearch = (Button) inputFragmentView.findViewById(R.id.Btnimages);
        EditTkeyword = (EditText) inputFragmentView.findViewById(R.id.eTimages);

        BtnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(EditTkeyword.getText().toString().trim().length() > 0) {

                    sendDataToFragment.putString("searchKeyword", EditTkeyword.getText().toString());
                    fragment.setArguments(sendDataToFragment);
                    getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.container, fragment)
                            .addToBackStack(null)
                            .commit();

                    hideSoftKeyboard(getActivity());
                }else{
                    Toast.makeText(getActivity(), "Enter keyword to find image!", Toast.LENGTH_LONG).show();
                }
            }
        });

        return inputFragmentView;
    }

    /**Change Activity on button push with chosen keyword*/

    public static void hideSoftKeyboard(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager)  activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
    }


}
