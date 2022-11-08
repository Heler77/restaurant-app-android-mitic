package com.example.restaurateappminticc4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class AcercaFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val acercaFramento = inflater.inflate(R.layout.acerca_fragment, container, false)

        return acercaFramento
        //super.onCreateView(inflater, container, savedInstanceState)
    }
}