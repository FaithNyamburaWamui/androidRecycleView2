package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
       val names= listOf("Amina","Caroline","Brenda","Daina","Esther","Flo","Gina","Hellen","Innocent","Jacob","Kelvin","Lisa","Mike","Naomi","Oscar","Pearl","Queen","Robert","Unyolo","Zany","Zippy","Janet")
  binding.rvNames.layoutManager=LinearLayoutManager(this)
        val nameAdapter=NamesRecyclerViewAdapter(names)
        binding.rvNames.adapter=nameAdapter
    }
}