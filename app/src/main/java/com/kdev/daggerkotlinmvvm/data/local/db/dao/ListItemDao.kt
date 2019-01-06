package com.kdev.daggerkotlinmvvm.data.local.db.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import android.arch.persistence.room.Query
import com.kdev.daggerkotlinmvvm.data.model.db.ListItem

@Dao
interface ListItemDao {

    @Query("SELECT * FROM ListItem")
    fun getAllListItems(): LiveData<List<ListItem>>

    @Query("SELECT * FROM ListItem WHERE itemId = :itemId")
    fun getItemById(itemId: Int): LiveData<ListItem>

    @Delete
    fun deleteListItem(listItem: ListItem)

    @Insert(onConflict = REPLACE)
    fun insertListItem(listItem: ListItem)

}