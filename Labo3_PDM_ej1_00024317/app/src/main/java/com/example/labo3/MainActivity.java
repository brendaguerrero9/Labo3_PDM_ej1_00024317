package com.example.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.labo3.utilities.AppConstants;

public class MainActivity extends AppCompatActivity {

    private static final String TAG=MainActivity.class.getSimpleName();
    private EditText et1,et2,et3,et4;
    private Button btn;

    @Override
    protected void onCreate(Bundle  savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.btn_send);

        et1=findViewById(R.id.et_user);
        et2=findViewById(R.id.et_pass);
        et3=findViewById(R.id.et_email);
        et4=findViewById(R.id.et_gender);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity.this,NewActivity.class);
                mIntent.putExtra("k1",et1.getText().toString());
                mIntent.putExtra("k2",et2.getText().toString());
                mIntent.putExtra("k3",et3.getText().toString());
                mIntent.putExtra("k4",et4.getText().toString());
                startActivity(mIntent);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent();
                mIntent.setAction(Intent.ACTION_SEND);
                mIntent.setType("text/plain");
                mIntent.putExtra(Intent.EXTRA_TEXT, "share");
                startActivity(mIntent);
            }
        });


    }
}
