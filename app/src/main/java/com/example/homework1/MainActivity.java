package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.homework1.R;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    private String enteredPhoneNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.send);
        editText= findViewById(R.id.edit_text);

        button.setOnClickListener(view -> {
            enteredPhoneNumber=editText.getText().toString();
            Intent intent=new Intent(this,SecondActivity.class);
            intent.putExtra("phone_number",enteredPhoneNumber);
            startActivity(intent);
        });
    }
}