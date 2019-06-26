package com.example.demoviewpagerandtablayout

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		//toolbar
		setSupportActionBar(toolbarMain)
		supportActionBar!!.title = getString(R.string.app_name)

		//adapter
		val mCommonAdapter = CommonAdapter(supportFragmentManager)
		viewPagerMain.apply {
			adapter = mCommonAdapter
			setPageTransformer(true, PageTransformer())
		}
		tabLayoutMain.setupWithViewPager(viewPagerMain)
	}
}
