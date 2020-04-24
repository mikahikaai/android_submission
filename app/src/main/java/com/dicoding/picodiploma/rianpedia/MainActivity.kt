package com.dicoding.picodiploma.rianpedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(){

    private lateinit var rvWisata: RecyclerView
    private var list : ArrayList<Wisata> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvWisata = findViewById(R.id.rv_wisata)
        rvWisata.setHasFixedSize(true)

        list.addAll(DataWisata.listData)
        showRecyclerList()

        if (supportActionBar != null){
            (supportActionBar as ActionBar).title = "Wisata Kalimantan Selatan"
        }

    }

    private fun showRecyclerList(){
        rvWisata.layoutManager = LinearLayoutManager(this)
        val listWisataAdapter = ListWisataAdapter(list)
        rvWisata.adapter = listWisataAdapter
        }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_utama, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode (selectedMode: Int){
        when(selectedMode){
            R.id.about -> {
                val intent = Intent(this, AboutActivity::class.java)
                this.startActivity(intent)
            }
        }
    }

}
