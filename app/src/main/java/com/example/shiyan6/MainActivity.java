package com.example.shiyan6;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=(Button)findViewById(R.id.button1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et=(EditText)findViewById(R.id.edittext1);
                String url=et.getText().toString();
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    //intent.setData(Uri.parse(url));
                    intent.setData(Uri.parse("https://www.baidu.com/"));
                    startActivity(intent);
            }
        });
    }
}
