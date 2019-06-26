package com.example.demoviewpagerandtablayout

import android.support.v4.view.ViewPager
import android.view.View

private const val MIN_SCALE = 0.85f

private const val MIN = -1f
private const val MAX = 1f
private const val MID = 0f

class PageTransformer : ViewPager.PageTransformer {
	override fun transformPage(view: View, position: Float) {
		view.apply {
			val pageWidth = width
			when {
				position <= MIN -> alpha = MID
				position <= MID -> {
					alpha = MAX
					scaleX = MAX
					scaleY = MAX
				}
				position <= MAX -> {
					alpha = MAX - position
					translationX = pageWidth * (-position) //negative then translate to left
					scaleX = (MIN_SCALE + (MAX - MIN_SCALE) * (MAX - Math.abs(position)))
					scaleY = (MIN_SCALE + (MAX - MIN_SCALE) * (MAX - Math.abs(position)))
				}
				else -> alpha = MID
			}
		}
	}
}
