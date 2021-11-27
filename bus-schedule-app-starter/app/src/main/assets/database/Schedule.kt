package database

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

data class Schedule () {
    @PrimaryKey(autoGenerate = true),
    @NonNull @ColumnInfo (name = "stop_name")

}


