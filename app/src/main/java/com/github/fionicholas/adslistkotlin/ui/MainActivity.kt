package com.github.fionicholas.adslistkotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.fionicholas.adslistkotlin.R
import com.github.fionicholas.adslistkotlin.data.Album
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerPhotos : RecyclerView
    private var listPhotos = listOf(
        Album(1,"Photo 1","https://via.placeholder.com/150/92c952"),
        Album(2,"Photo 2","https://via.placeholder.com/150/771796"),
        Album(3,"Photo 3","https://via.placeholder.com/150/24f355"),
        Album(4,"Photo 4","https://via.placeholder.com/150/d32776"),
        Album(5,"Photo 5","https://via.placeholder.com/150/f66b97"),
        Album(6,"Photo 6","https://via.placeholder.com/150/56a8c2")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerPhotos = rv_photos

        recyclerPhotos.layoutManager = GridLayoutManager(this, 2)
        recyclerPhotos.adapter = AlbumAdapter(listPhotos)
    }

}
