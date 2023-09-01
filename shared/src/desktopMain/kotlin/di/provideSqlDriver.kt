package di

import app.cash.sqldelight.driver.jdbc.sqlite.JdbcSqliteDriver
import databaseFilename
import java.io.File

fun provideSqlDriver(): JdbcSqliteDriver {
    val databasePath = File(System.getProperty("java.io.tmpdir"), databaseFilename)
    return JdbcSqliteDriver(url = "jdbc:sqlite:${databasePath.absolutePath}")
}