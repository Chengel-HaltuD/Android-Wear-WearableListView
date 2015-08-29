package com.gele.wear.firstwear;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Administrator on 2015/7/29.
 */
public class WearActivity extends Activity  {

    private TextView mTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_wear_main);

        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                mTextView = (TextView) stub.findViewById(R.id.text);
            }
        });

        Log.i("log", "嘻嘻");

    }

    public void btnSimpleClick(View view){
        Intent intent = new Intent(this, SimpleListActivity.class);
        startActivity(intent);
    }

    public void btnAdvancedClick(View view){
        Intent intent = new Intent(this, AdvancedListActivity.class);
        startActivity(intent);
    }

}
