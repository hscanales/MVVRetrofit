package com.petrlr14.mvvm.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json

@Entity(tableName = "repos")
data class GitHubRepo(

    @PrimaryKey
    @field:Json(name="id")
    val id: Long,
    @field:Json(name="name")
    val name: String,

    @field:Json(name="full_name")
    @ColumnInfo(name="full_name")
    val fullName:String
)