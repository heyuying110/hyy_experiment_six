package com.example.administrator.hyy_experiment_six;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    protected EditText editText;
    protected Button btn;
    public static String Name="name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        setListern();
    }

    private void setListern() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                   Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                   intent.putExtra(Name,editText.getText().toString());
                   startActivity(intent);
            }
        });
    }

    private void init() {
         editText=findViewById(R.id.edit_content);
         btn=findViewById(R.id.btn);
    }
}
