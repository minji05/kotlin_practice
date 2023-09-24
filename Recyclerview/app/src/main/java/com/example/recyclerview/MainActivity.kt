package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 데이터 원본 준비
        val dataList = mutableListOf<MyItem>()
        dataList.add(MyItem(R.drawable.ic_launcher_background, "Bella", "1"))
        dataList.add(MyItem(R.drawable.ic_launcher_background, "Charlie", "2"))
        dataList.add(MyItem(R.drawable.ic_launcher_background, "Daisy", "1.5"))
        dataList.add(MyItem(R.drawable.ic_launcher_background, "Duke", "1"))
        dataList.add(MyItem(R.drawable.ic_launcher_background, "Max", "2"))
        dataList.add(MyItem(R.drawable.ic_launcher_background, "Happy", "4"))
        dataList.add(MyItem(R.drawable.ic_launcher_background, "Luna", "3"))
        dataList.add(MyItem(R.drawable.ic_launcher_background, "Bob", "2"))
        dataList.add(MyItem(R.drawable.ic_launcher_background, "Bob", "2"))
        dataList.add(MyItem(R.drawable.ic_launcher_background, "Bob", "2"))
        dataList.add(MyItem(R.drawable.ic_launcher_background, "Bob", "2"))
        dataList.add(MyItem(R.drawable.ic_launcher_background, "Bob", "2"))
        dataList.add(MyItem(R.drawable.ic_launcher_background, "Bob", "2"))
        dataList.add(MyItem(R.drawable.ic_launcher_background, "Bob", "2"))
        dataList.add(MyItem(R.drawable.ic_launcher_background, "Bob", "2"))


       // binding.recyclerView.adapter = MyAdapter(dataList)

        val adapter = MyAdapter(dataList)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)



    }
}