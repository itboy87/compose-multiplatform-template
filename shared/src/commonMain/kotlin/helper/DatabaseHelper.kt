package helper

import com.example.database.AppDatabase

class DatabaseHelper(private val appDatabase: AppDatabase) {
    val databaseQueries = appDatabase.databaseQueries
}