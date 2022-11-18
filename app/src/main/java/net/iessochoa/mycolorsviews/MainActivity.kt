package net.iessochoa.mycolorsviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import net.iessochoa.mycolorsviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListeners()
    }

        private fun colorearElemento(view: View) {
            when (view.id) {
// Ponemos un color según el elemento correspondiente
                R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
                R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
                R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
                R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
                R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
                else -> view.setBackgroundColor(Color.LTGRAY)
            }
        }
        private fun setListeners()
        {

            binding.boxOneText.setOnClickListener { colorearElemento(it) }
            binding.boxTwoText.setOnClickListener { colorearElemento(it) }
            binding.boxThreeText.setOnClickListener { colorearElemento(it) }
            binding.boxFourText.setOnClickListener { colorearElemento(it) }
            binding.boxFiveText.setOnClickListener { colorearElemento(it) }
            binding.root.setOnClickListener { colorearElemento(it) }
        }
    }
}