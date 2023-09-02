package di

import android.content.Context
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import com.example.database.AppDatabase
import databaseFilename

fun provideSqlDriver(context: Context): AndroidSqliteDriver {
    return AndroidSqliteDriver(AppDatabase.Schema, context, databaseFilename)
}
