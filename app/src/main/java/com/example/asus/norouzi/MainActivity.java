package com.example.asus.norouzi;

import android.app.ListActivity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;


public class MainActivity extends ListActivity {

    private static final int REQUEST_CODE = 100;
    List<Phone> phones = new PhoneData().getPhones();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PhoneAdapter adapter = new PhoneAdapter(this, R.layout.item_phone, phones);

//        ArrayAdapter<Phone> adapter = new ArrayAdapter<Phone>(this, android.R.layout.simple_list_item_1, phones);
        setListAdapter(adapter);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_CODE && resultCode == RESULT_OK){

            String phoneName = data.getStringExtra("phoneName");
            String action = data.getStringExtra("action");

            if(action.equals("add")) {
                Toast.makeText(this, "Adding 1 "+ phoneName + " to cart", Toast.LENGTH_LONG ).show();
            }
        }
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Phone phone = phones.get(position);

        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("phoneName", phone.phoneName);
        intent.putExtra("imageResource", phone.imageResource);
        intent.putExtra("AboutPhone", phone.AboutPhone);
        startActivityForResult(intent, REQUEST_CODE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
