package com.kdev.daggerkotlinmvvm.data.service.repositories

import android.arch.lifecycle.LiveData
import com.kdev.daggerkotlinmvvm.data.local.db.dao.ListItemDao
import com.kdev.daggerkotlinmvvm.data.model.db.ListItem

class ListItemRepository constructor(private val listItemDao: ListItemDao) {

    val listOfData: LiveData<List<ListItem>>
        get() = listItemDao.getAllListItems()

    fun getListItem(itemId: Int): LiveData<ListItem> = listItemDao.getItemById(itemId)

    fun deleteItem(listItem: ListItem) = listItemDao.deleteListItem(listItem)

    fun insertItem(listItem: ListItem) = listItemDao.insertListItem(listItem)
}