package com.mahmoodapps.loginsignup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {
    private TextView sup,act,sin,fbook;
    private EditText usrusr,pswd,mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        sup = (TextView)findViewById(R.id.sup);
        sin = (TextView)findViewById(R.id.sin);
        fbook = (TextView)findViewById(R.id.fboook);
        act = (TextView)findViewById(R.id.act);
        mail = (EditText)findViewById(R.id.mal);
        pswd = (EditText)findViewById(R.id.pswd);
        usrusr = (EditText)findViewById(R.id.usrusr);
        sin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent it = new Intent(SignupActivity.this, LoginActivity.class);
                startActivity(it);
            }
        });
    }
}
