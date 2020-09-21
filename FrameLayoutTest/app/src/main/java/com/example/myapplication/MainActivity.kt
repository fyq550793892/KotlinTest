package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.left_fragment.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btReplaceAnother.setOnClickListener {
            //replaceFragment(AnotherRightFragment())
            val mStr = (leftFragment as LeftFragment).myTestFragmentStr
            btReplaceAnother.text = mStr
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragManager = supportFragmentManager
        val transaciton = fragManager.beginTransaction()
        transaciton.replace(R.id.flReplace, fragment)
        transaciton.addToBackStack(null)
        transaciton.commit()
    }


}