package com.example.myapplication113

import Animal
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import layout.AnimalAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val animalsList = listOf(
            Animal("Кіт", "Опис кота", getString(R.string.cat_full_description) ,  R.drawable.cat_image),
            Animal("Собака", "Опис собаки", getString(R.string.dog_full_description), R.drawable.dog),
            Animal("Заєць", "Опис зайця", getString(R.string.rabbit_full_description), R.drawable.rabbit)
        )

        val recyclerView: RecyclerView = findViewById(R.id.rvAnimals)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = AnimalAdapter(animalsList)
    }
}