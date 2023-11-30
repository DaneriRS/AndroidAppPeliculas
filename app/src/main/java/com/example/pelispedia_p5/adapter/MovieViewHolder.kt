package com.example.pelispedia_p5.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.pelispedia_p5.Movie
import com.example.pelispedia_p5.databinding.ItemMovieBinding

class MovieViewHolder(view: View):ViewHolder(view) {

    val binding = ItemMovieBinding.bind(view)

    //val movie = view.findViewById<TextView>(R.id.tvMovieName)
    //val year = view.findViewById<TextView>(R.id.tvMovieYear)
    //val time = view.findViewById<TextView>(R.id.tvMovieTime)
    //val photo = view.findViewById<ImageView>(R.id.ivMovie)

    fun render(movieModel: Movie, onClickListener: (Movie) -> Unit){
        binding.tvMovieName.text = movieModel.movie
        binding.tvMovieYear.text = movieModel.year
        binding.tvMovieTime.text = movieModel.time
        Glide.with(binding.ivMovie.context).load(movieModel.photo).into(binding.ivMovie)
        //Ya no es necesario porque se agrego en adapter y aqui
        // binding.ivMovie.setOnClickListener{ Toast.makeText(binding.ivMovie.context, movieModel.movie, Toast.LENGTH_SHORT ).show() }

        itemView.setOnClickListener{
            Toast.makeText(
                binding.ivMovie.context,
                movieModel.movie,
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}