package com.example.badal.secondassign;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HintActivity extends AppCompatActivity {
private Button show_button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hint);
        show_button=(Button) findViewById(R.id.shans_btn);
        textView=(TextView) findViewById(R.id.txt_hnt);
        show_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("See if it can be factorized");
                String res="Seen Hint!!";
                Intent returnintent=new Intent();
                returnintent.putExtra("Message",res);
                setResult(Activity.RESULT_OK,returnintent);
            }
        });
    }
}
