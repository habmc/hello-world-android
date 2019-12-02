package com.example.helloha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Change the text color of the label
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView3)).setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            }
        });

        // Change the color of the background view
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.orange));
            }
        });

        // Change the text string of the label
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView3)).setText("Goodbye!");
            }
        });

        // Reset all views to default settings
        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView3)).setTextColor(getResources().getColor(R.color.white));
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                ((TextView) findViewById(R.id.textView3)).setText("Hello from Ha!");
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString(); // user's input

                // If the text field is empty, update label with default text string
                if (TextUtils.isEmpty(newText)) {
                    ((TextView) findViewById(R.id.textView3)).setText("Hello from Ha!");
                } else {
                    // Update label with inputted string
                    ((TextView) findViewById(R.id.textView3)).setText(newText);
                }
            }
        });
    }
}
