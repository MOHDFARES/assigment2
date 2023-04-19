package com.example.assigment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.view.MenuInflater as MenuInflater1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val inflater = menuInflater
        inflater.inflate(R.menu.my_first_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item1->Toast.makeText(this,"item 1 selected",Toast.LENGTH_SHORT).show()
            R.id.item2->Toast.makeText(this,"item 2 selected",Toast.LENGTH_SHORT).show()
            R.id.subitem1->Toast.makeText(this,"Sub-item 1 selected",Toast.LENGTH_SHORT).show()
        }
        return true;

    }

}