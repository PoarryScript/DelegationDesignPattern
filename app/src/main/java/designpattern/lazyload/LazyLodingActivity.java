package designpattern.lazyload;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import nestviewpager.simple.com.delegationdesignpattern.R;

public class LazyLodingActivity extends AppCompatActivity {

    private TextView contentTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lazy_loding);
        contentTv = (TextView) findViewById(R.id.content_tv);
        HolderNaive holderNaive = new HolderNaive();
        Heavy heavy = holderNaive.getHeavy();

        StringBuilder sb = new StringBuilder();
        sb.append(heavy.toString() + "\n");


        HolderThreadSafe holderThreadSafe = new HolderThreadSafe();
        Heavy heavyThreadSafe = holderThreadSafe.getHeavy();
        sb.append(heavyThreadSafe.toString() + "\n");
        contentTv.setText(sb.toString());
    }
}
