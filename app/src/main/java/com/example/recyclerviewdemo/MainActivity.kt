package com.example.recyclerviewdemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
//    private val fruitList = listOf<String>("a", "b", "c", "d", "e", "f", "g", "h")
    val fruitList = listOf<Fruit>(
        Fruit("Mango", "Joe"),
        Fruit("Apple","Frank"),
        Fruit("Banana","Tom"),
        Fruit("Guava","Joe"),
        Fruit("Lemon","Alex"),
        Fruit("Pear","Joe"),
        Fruit("Orange","Alex"),
        Fruit("Mango", "Joe"),
        Fruit("Apple","Frank"),
        Fruit("Banana","Tom"),
        Fruit("Guava","Joe"),
        Fruit("Lemon","Alex"),
        Fruit("Pear","Joe"),
        Fruit("Orange","Alex")
    )
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.myRecyclerView)
        recyclerView.setBackgroundColor(Color.BLUE)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyRecyclerViewAdapter(fruitList,) {
            selectedItem: Fruit -> listItemClicked(selectedItem)
        }

    }
    private fun listItemClicked(fruit: Fruit) {
        Toast.makeText(this, "Supplier is: ${fruit.supplier}",
            Toast.LENGTH_SHORT).show()
    }
}