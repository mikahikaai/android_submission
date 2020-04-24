package com.dicoding.picodiploma.rianpedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvJudul: TextView = findViewById(R.id.tv_item_name)
        val tvLokasi: TextView =findViewById(R.id.tv_item_lokasi)
        val tvDetail: TextView = findViewById(R.id.tv_item_detail)
        val ivImageView: ImageView = findViewById(R.id.item_img_photo)


        val judul = intent.getStringExtra(EXTRA_JUDUL)
        val lokasi = intent.getStringExtra(EXTRA_LOKASI)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val img: Int? = intent.getIntExtra(EXTRA_IMAGE,0)

        if (supportActionBar != null)
            (supportActionBar as ActionBar).title = "Detail $judul"

        Glide.with(this)
            .load(img)
            .apply(RequestOptions())
            .into(ivImageView)
        tvJudul.text = judul
        tvLokasi.text = lokasi
        tvDetail.text = detail

    }

    companion object{
        const val EXTRA_JUDUL = "extra_data"
        const val EXTRA_LOKASI = "extra_lokasi"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_IMAGE = "extra_image"
    }
}
