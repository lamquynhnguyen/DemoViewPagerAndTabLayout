package com.example.demoviewpagerandtablayout.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.demoviewpagerandtablayout.R

class FragmentTwo : Fragment() {

	override fun onCreateView(
			inflater: LayoutInflater, container: ViewGroup?,
			savedInstanceState: Bundle?
	): View? {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_fragment_two, container, false)
	}

	companion object {
		fun newInstance(): FragmentTwo = FragmentTwo()
	}
}
