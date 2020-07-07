package com.example.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.DividerItemDecoration
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var movieList  = arrayListOf<Movie>(
                Movie("Captain Amarica",6),
                Movie("Iron man",7),
                Movie("Hulk",9),
                Movie("Ghost",8),
                Movie("Namaste London",5),
                Movie("Thor",10),
                Movie("Hello",3),
                Movie("Horn OK please",4),
                Movie("Money Heist",9),
                Movie("Avengers",2),
                Movie("College road",1)
        )

        Log.i("MainActivity",movieList.toString())

        var recyclerAdpater = RecyclerAdpater(movieList)
        recyclerView.adapter = recyclerAdpater
        recyclerView.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))
        recyclerView.setHasFixedSize(true)

    }
}
