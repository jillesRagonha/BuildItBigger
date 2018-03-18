package br.com.agilles.showjoke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowJokeActivity extends AppCompatActivity {

    public final static String INTENT_JOKE = "INTENT_JOKE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_joke);
        TextView textView = findViewById(R.id.text_joke);

        Intent intent = getIntent();

        if (intent != null) {
            String joke = intent.getStringExtra(INTENT_JOKE);
            textView.setText(joke);
        }

    }
}
