package com.example.demoviewpagerandtablayout

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.demoviewpagerandtablayout.fragments.*

private const val TITLE_KONNICHIWA = "Konnichiwa"
private const val TITLE_HELLO = "Hello"
private const val TITLE_HOLA = "Hola"
private const val TITLE_NIHAO = "Nihao"
private const val TITLE_XINCHAO = "Xin chao"

class CommonAdapter(mFragmentManager: FragmentManager) : FragmentPagerAdapter(mFragmentManager) {

	override fun getItem(p0: Int): Fragment? = when (p0) {
		0 -> FragmentOne.newInstance()
		1 -> FragmentTwo.newInstance()
		2 -> FragmentThree.newInstance()
		3 -> FragmentFour.newInstance()
		4 -> FragmentFive.newInstance()
		else -> null
	}

	override fun getCount(): Int = 5

	override fun getPageTitle(position: Int): CharSequence? = when (position) {
		0 -> TITLE_KONNICHIWA
		1 -> TITLE_HELLO
		2 -> TITLE_HOLA
		3 -> TITLE_NIHAO
		4 -> TITLE_XINCHAO
		else -> ""
	}
}
