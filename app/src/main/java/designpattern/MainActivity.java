package designpattern;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import designpattern.delegation.DelegationActivityActivity;
import nestviewpager.simple.com.delegationdesignpattern.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

   public void delegationClick(View view){
        Intent intent = new Intent( this, DelegationActivityActivity.class);
        startActivity(intent);
    }
}
