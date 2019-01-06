package com.kdev.daggerkotlinmvvm.ui.base

import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.kdev.daggerkotlinmvvm.R

abstract class BaseActivity: AppCompatActivity() {

    @LayoutRes abstract fun getLayoutId(): Int


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
    }

    protected fun replaceFragment(fragment: Fragment, tag: String, resId: Int = R.id.container) {
        val currFragment = supportFragmentManager.findFragmentByTag(tag)
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(resId, currFragment ?: fragment, tag)
        transaction.addToBackStack(tag)
        transaction.commit()
    }
}