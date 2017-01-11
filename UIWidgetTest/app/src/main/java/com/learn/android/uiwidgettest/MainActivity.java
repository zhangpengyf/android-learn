package com.learn.android.uiwidgettest;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import static android.R.attr.onClick;

public class MainActivity extends Activity implements View.OnClickListener {

    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(this);
        editText = (EditText)findViewById(R.id.edit_text);
        imageView = (ImageView)findViewById(R.id.image_view);
        progressBar = (ProgressBar)findViewById(R.id.progress_bar);
    }

    @Override
public void onClick(View var1) {
    switch (var1.getId()){
        case R.id.button:
            Log.d("MainActivity", "press button");
            String inputText = editText.getText().toString();
            Toast.makeText(MainActivity.this, inputText, Toast.LENGTH_SHORT).show();
            imageView.setImageResource(R.drawable.webrtc);
            if (progressBar.getVisibility() == View.GONE) {
                progressBar.setVisibility(View.VISIBLE);
            } else {
                progressBar.setVisibility(View.GONE);
            }
            int progress = progressBar.getProgress();
            progress = progress + 10;
            progressBar.setProgress(progress);
            break;
        default:
            break;
    }
}
}
