package com.kdev.daggerkotlinmvvm.data.local.db

import android.arch.persistence.room.Database
import com.kdev.daggerkotlinmvvm.data.local.db.dao.ListItemDao
import com.kdev.daggerkotlinmvvm.data.model.db.ListItem

@Database(entities = [ListItem::class], version = 1)
abstract class ListItemDatabase {

    abstract fun listItemDao(): ListItemDao

}