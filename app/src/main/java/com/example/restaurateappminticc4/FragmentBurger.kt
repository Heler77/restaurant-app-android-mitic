package com.example.restaurateappminticc4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentBurger: Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val hambFramento = inflater.inflate(R.layout.burger_fragment, container, false)

        return hambFramento
        //super.onCreateView(inflater, container, savedInstanceState)
    }

}