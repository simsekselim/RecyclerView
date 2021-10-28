package com.simsekselim.recyclerview


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.simsekselim.recyclerview.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding
private lateinit var landmarkList : ArrayList<Landmark>

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()

        val pisa = Landmark("Pisa","Italy",R.drawable.pisa)
        val colloseum = Landmark("Colloseum","Italy",R.drawable.colloseum)
        val eiffel = Landmark("Eiffel","France",R.drawable.eiffel)
        val londonBridge = Landmark("London Bridge","United Kingdom",R.drawable.londonbridge)

        landmarkList.add(pisa)
        landmarkList.add(colloseum)
        landmarkList.add(eiffel)
        landmarkList.add(londonBridge)



        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val LandmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = LandmarkAdapter

    }



}