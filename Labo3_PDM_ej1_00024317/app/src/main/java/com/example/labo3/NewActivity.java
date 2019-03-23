package com.example.labo3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;


public class NewActivity extends AppCompatActivity {

    private EditText et1, et2, et3, et4;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        et1 = findViewById(R.id.user);
        et2 = findViewById(R.id.pass);
        et3 = findViewById(R.id.email);
        et4 = findViewById(R.id.gender);


        Intent mIntent = getIntent();
        if (mIntent != null) {
            et1.setText(mIntent.getStringExtra("k1"));
            et2.setText(mIntent.getStringExtra("k2"));
            et3.setText(mIntent.getStringExtra("k3"));
            et4.setText(mIntent.getStringExtra("k4"));

        }

        btn = findViewById(R.id.btn_share);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mmIntent = new Intent();
                mmIntent.setAction(Intent.ACTION_SEND);
                mmIntent.setType("text/plain");
                mmIntent.putExtra("ky1", user.getText().toString());
                mmIntent.putExtra("ky2", pass.getText().toString());
                mmIntent.putExtra("ky3", email.getText().toString());
                mmIntent.putExtra("ky4", gender.getText().toString());
                startActivity(mmIntent);

            }
        });

    }
}
