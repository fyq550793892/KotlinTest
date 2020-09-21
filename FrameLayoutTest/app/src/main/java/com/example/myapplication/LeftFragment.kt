package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.left_fragment.*

/**
 * @Author: fyq
 * @Description: LeftFragment
 * @CreateDate: 2020/9/20
 */
class LeftFragment:Fragment() {
    companion object {
        private const val TAG = "LeftFragment"
    }
    val myTestFragmentStr = "我是谁"
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.left_fragment,container, false)
    }

    override fun onResume() {
        super.onResume()
        val mActivity = activity as MainActivity
        Log.d(TAG, "onCreateView: " + mActivity.btReplaceAnother.text)
    }
}