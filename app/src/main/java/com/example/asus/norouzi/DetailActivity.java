package com.example.asus.norouzi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailActivity extends Activity {

    private String phoneName ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();

        phoneName = intent.getStringExtra("phoneName");
        int imageResource = intent.getIntExtra("imageResource", 0);
        String AboutPhone = intent.getStringExtra("AboutPhone");

        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(phoneName);

        tv = (TextView) findViewById(R.id.textView2);
        tv.setText(AboutPhone);

        ImageView image = (ImageView) findViewById(R.id.imageView);
        image.setImageResource(imageResource);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.detail, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void addToCart(MenuItem item){
        Intent intent = new Intent();
        intent.putExtra("phoneName", phoneName);
        intent.putExtra("action", "add");
        setResult(RESULT_OK, intent);
        finish();
    }
}
