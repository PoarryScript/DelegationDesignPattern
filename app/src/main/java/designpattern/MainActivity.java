package designpattern;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import designpattern.builder.BuilderActivity;
import designpattern.callback.CallBackActivity;
import designpattern.delegation.DelegationActivityActivity;
import designpattern.lazyload.LazyLodingActivity;
import nestviewpager.simple.com.delegationdesignpattern.R;

public class MainActivity extends AppCompatActivity {

    Thread thread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void delegationClick(View view) {
        Intent intent = new Intent(MainActivity.this, DelegationActivityActivity.class);
        startActivity(intent);
    }

    public void callbackClick(View view) {
        Intent intent = new Intent(MainActivity.this, CallBackActivity.class);
        startActivity(intent);
    }

    public void builder(View view) {
        Intent intent = new Intent(MainActivity.this, BuilderActivity.class);
        startActivity(intent);
    }

    public void lazyLoding(View view) {
        Intent intent = new Intent(MainActivity.this, LazyLodingActivity.class);
        startActivity(intent);
    }
}
