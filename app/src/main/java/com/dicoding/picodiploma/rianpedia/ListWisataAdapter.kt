package com.dicoding.picodiploma.rianpedia

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListWisataAdapter(private val listWisata: ArrayList<Wisata>) : RecyclerView.Adapter<ListWisataAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_wisata, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listWisata.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (judul,lokasi,detail,img) = listWisata[position]

        Glide.with(holder.itemView.context)
            .load(img)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.tvName.text = judul
        holder.tvLokasi.text = lokasi

        holder.itemView.setOnClickListener{
            val moveWithData = Intent (holder.itemView.context, DetailActivity::class.java)
            moveWithData.putExtra(DetailActivity.EXTRA_JUDUL, judul)
            moveWithData.putExtra(DetailActivity.EXTRA_LOKASI, lokasi)
            moveWithData.putExtra(DetailActivity.EXTRA_DETAIL, detail)
            moveWithData.putExtra(DetailActivity.EXTRA_IMAGE, img)
            holder.itemView.context.startActivity(moveWithData)
        }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvLokasi: TextView = itemView.findViewById(R.id.tv_item_lokasi)
        var imgPhoto: ImageView = itemView.findViewById(R.id.item_img_photo)
    }

}
