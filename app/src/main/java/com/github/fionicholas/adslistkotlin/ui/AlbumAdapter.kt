package com.github.fionicholas.adslistkotlin.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.github.fionicholas.adslistkotlin.R
import com.github.fionicholas.adslistkotlin.data.Album
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_photo.view.*

class AlbumAdapter(private val albumList: List<Album>)
    : RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
       val itemView = LayoutInflater.from(parent.context)
           .inflate(R.layout.item_photo, parent, false)

        return AlbumViewHolder(itemView)
    }

    override fun getItemCount(): Int = albumList.size


    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        holder.bindItem(albumList[position])
    }

    class AlbumViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
            val txtId = itemView.tv_id
            val txtTitle = itemView.tv_title
            val parent = itemView.layout_main
            val imgPhoto = itemView.iv_photo

        fun bindItem(album : Album){
            txtId.text = "Id : " + album.id.toString()
            txtTitle.text = "Title : " + album.title

            Picasso.get()
                .load(album.image)
                .into(imgPhoto)
        }
    }
}