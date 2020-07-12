package com.example.homework2_podpiska;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextName = findViewById(R.id.editTextTextPersonName);
        final EditText editTextEmail = findViewById(R.id.editTextTextEmailAddress);
        final TextView textView = findViewById(R.id.textView3);
        Button buttonOk = findViewById(R.id.buttonOk);
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                String email = editTextEmail.getText().toString();
                String text =  "Подписка на рассылку успешно оформлена для пользователя " + name +
                        " на электронный адрес " + email;
                textView.setText(text);
            }
        });
        Button buttonClear = findViewById(R.id.buttonClear);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
                editTextName.setText("");
                editTextEmail.setText("");
            }
        });

    }
}