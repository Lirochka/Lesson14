package com.example.lesson14

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment(R.layout.fragment_second) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        tvCongratulations.text = "Поздравляю с созданием Git repository"
        ivCongratulations.setImageResource(R.drawable.pozitivnye)

        Toast.makeText(requireContext(), "Вы создали Git repository",
        Toast.LENGTH_SHORT).show()


    }
}