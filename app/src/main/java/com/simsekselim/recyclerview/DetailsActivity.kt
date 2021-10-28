package com.simsekselim.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.simsekselim.recyclerview.databinding.ActivityDetailsBinding


private lateinit var binding: ActivityDetailsBinding


class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent

        //With Singleton

        val selectedLandmark = Singleton.chosenLandmark

        selectedLandmark?.let {
            binding.nameText.text = it.name
            binding.countryText.text = it.country
            binding.imageView.setImageResource(it.image)

        }




       /*

       without Singleton

       val selectedLandmark = intent.getSerializableExtra("landmark") as Landmark

        binding.nameText.text = selectedLandmark.name
        binding.countryText.text = selectedLandmark.country
        binding.imageView.setImageResource(selectedLandmark.image)

        */

    }

}