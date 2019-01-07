package com.kdev.daggerkotlinmvvm.ui.list

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import android.os.AsyncTask
import com.kdev.daggerkotlinmvvm.data.model.db.ListItem
import com.kdev.daggerkotlinmvvm.data.service.repositories.ListItemRepository
import javax.inject.Inject

class ListItemCollectionViewModel(private val listItemRepository: ListItemRepository) : ViewModel() {

    fun getAllListItems(): LiveData<List<ListItem>> = listItemRepository.listOfData

    fun deleteItem(listItem: ListItem) = {
        val deleteAsyncTask = DeleteListItemAsyncTask()
        deleteAsyncTask.execute(listItem)
    }

    private inner class DeleteListItemAsyncTask: AsyncTask<ListItem, Void, Void>() {
        override fun doInBackground(vararg item: ListItem): Void? {
            listItemRepository.deleteItem(item[0])
            return null
        }
    }
}