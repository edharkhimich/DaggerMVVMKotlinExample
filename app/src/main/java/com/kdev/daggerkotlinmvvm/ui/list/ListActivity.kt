package com.kdev.daggerkotlinmvvm.ui.list

import android.os.Bundle
import com.kdev.daggerkotlinmvvm.R
import com.kdev.daggerkotlinmvvm.ui.base.BaseActivity
import timber.log.Timber

class ListActivity : BaseActivity(){

    override fun getLayoutId(): Int = R.layout.activity_list

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        replaceFragment(ListFragment(), ListFragment::class.java.simpleName)
        Timber.d(ListFragment::class.java.simpleName)
    }
}
