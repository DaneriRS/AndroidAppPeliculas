package com.example.pelispedia_p5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pelispedia_p5.adapter.MovieAdapter
import com.example.pelispedia_p5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //MovieList.movieList
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView(){
        //val recyclerView = findViewById<RecyclerView>(R.id.recyclerSuperHero)
        //recyclerView.layoutManager = LinearLayoutManager(this)
        //recyclerView.adapter = MovieAdapter(MovieList.movieList)

        val manager = LinearLayoutManager(this)
        //val decoration = DividerItemDecoration(this, manager.orientation)

        binding.recyclerMovie.layoutManager = manager
        binding.recyclerMovie.adapter = MovieAdapter(MovieList.movieList) {movie ->
            onItemSelected(
                movie
            )
        }
        //binding.recyclerMovie.addItemDecoration(decoration)

    }

    fun onItemSelected(movie:Movie){
        Toast.makeText(this, movie.movie, Toast.LENGTH_SHORT).show()
    }

}