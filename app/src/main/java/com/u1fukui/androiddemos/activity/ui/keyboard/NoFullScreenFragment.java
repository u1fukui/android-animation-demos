package com.u1fukui.androiddemos.activity.ui.keyboard;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.u1fukui.androiddemos.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class NoFullScreenFragment extends Fragment {

    private static final String[] strings = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};

    @InjectView(R.id.list)
    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_edit_text, container, false);
        ButterKnife.inject(this, view);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        listView.setAdapter(adapter);

        return view;
    }
}
