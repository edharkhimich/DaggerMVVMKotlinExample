package com.kdev.daggerkotlinmvvm.utils

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.support.v4.app.ListFragment
import com.kdev.daggerkotlinmvvm.data.service.repositories.ListItemRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CustomViewModelFactory: ViewModelProvider.Factory {

    @Inject
    constructor(listItemRepository: ListItemRepository)

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(ListFragment::class.java){
                return ListItemView
            }
    }
}