package com.u1fukui.androiddemos.activity.ui.keyboard;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.u1fukui.androiddemos.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class DefaultKeyboardActivity extends ActionBarActivity {

    private static final String[] strings = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};

    @InjectView(R.id.list)
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_edit_text);
        ButterKnife.inject(this);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, strings);
        listView.setAdapter(adapter);
    }
}
