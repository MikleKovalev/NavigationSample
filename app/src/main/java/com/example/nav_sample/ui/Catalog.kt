package com.example.nav_sample.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.nav_sample.R
import kotlinx.android.synthetic.main.fragment_catalog.*

class Catalog : Fragment(R.layout.fragment_catalog) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navigation = Navigation.findNavController(view)
        button.setOnClickListener {

        }
    }
}