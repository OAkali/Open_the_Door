package com.example.openthedoor;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button button;
private EditText editText1,editText2;
private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       editText1=findViewById(R.id.edit);
       editText2=findViewById(R.id.edit2);
       button=findViewById(R.id.open);
       layout=findViewById(R.id.layout);
       editText1.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

           }

           @Override
           public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
               if(editText1.getText().toString().isEmpty()){
                   button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.whe));
               }else {
                   button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.wh));
               }

           }

           @Override
           public void afterTextChanged(Editable editable) {

           }
       });
        editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {
                if(editText2.getText().toString().isEmpty()){
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.whe));
                }else {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.wh));
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


       button.setOnClickListener(v -> {
           if(editText1.getText().toString().equals("admin")&& editText2.getText().toString().equals("admin")){
               layout.setVisibility(View.GONE);
               Toast.makeText(MainActivity.this, "welcome", Toast.LENGTH_SHORT).show();
           }
           else{Toast.makeText(MainActivity.this,"!!!!",Toast.LENGTH_SHORT).show();

           }

       });


    }
}