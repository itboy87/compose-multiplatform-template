package di

import app.cash.sqldelight.driver.native.NativeSqliteDriver
import com.example.database.AppDatabase
import databaseFilename

fun provideSqlDriver(): NativeSqliteDriver {
    return NativeSqliteDriver(AppDatabase.Schema, databaseFilename)
}