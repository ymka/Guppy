package com.github.ymka.guppy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.github.ymka.guppy.adapter.GuppyAdapter
import com.github.ymka.guppy.adapter.Item

class MainActivity : AppCompatActivity() {

    private val adapter = GuppyAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        adapter.items = generateItems()
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun generateItems(): List<Item> {
        val items = mutableListOf<Item>()
        for (item in 0 .. 10) {
            when (item) {
                0, 3, 4, 7 -> items.add(Item.FirstItem("First $item"))
                1, 2, 6, 8, 10 -> items.add(Item.SecondItem("Second $item"))
                else -> items.add(Item.Empty)
            }
        }

        return items
    }

}
