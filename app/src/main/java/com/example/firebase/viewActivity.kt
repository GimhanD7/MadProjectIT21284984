package com.example.firebase

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class viewActivity : AppCompatActivity() {
    private lateinit var useRecycleView:RecyclerView
    private lateinit var tvloading:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        useRecycleView=findViewById(R.id.rvView)
        useRecycleView.layoutManager=LinearLayoutManager(this)
        useRecycleView.setHasFixedSize(true)
        tvloading=findViewById(R.id.tvloading)
    }
}
