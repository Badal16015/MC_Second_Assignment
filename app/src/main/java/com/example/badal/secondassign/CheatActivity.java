package com.example.badal.secondassign;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CheatActivity extends AppCompatActivity {
    private Button cheat_button;
    private TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);
        cheat_button=(Button) findViewById(R.id.shwans_btn);
        textView1=(TextView) findViewById(R.id.txt_cheat);
        Bundle bundle=getIntent().getExtras();
        final String msg=bundle.getString("Message1");
        cheat_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(Integer.parseInt(msg)==1)
                textView1.setText("The given number is not prime");
                else{
                    textView1.setText("The given number is prime");
                }
                String resultm="Answer Cheated!!";
                Intent returnintent=new Intent();
                returnintent.putExtra("NewMessage",resultm);
                setResult(Activity.RESULT_OK,returnintent);
            }
        });
    }
}
