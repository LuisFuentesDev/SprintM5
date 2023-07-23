package com.example.sprintm5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sprintm5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initAdapter()
    }

    private fun initAdapter() {
        val adapter = Adapter()
        val zapatilla = Zapatillas.getZapatillas()
        adapter.setData(zapatilla)
        binding.recyclerView.adapter = adapter
    }
}