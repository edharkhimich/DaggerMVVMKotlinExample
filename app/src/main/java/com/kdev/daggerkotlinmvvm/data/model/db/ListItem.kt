package com.kdev.daggerkotlinmvvm.data.model.db

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class ListItem(@field:PrimaryKey var itemId: Int, var message: String, var colorRes: Int) {
}