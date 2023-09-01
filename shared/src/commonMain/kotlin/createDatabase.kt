import app.cash.sqldelight.db.SqlDriver
import com.example.database.AppDatabase

fun createDatabase(sqlDriver: SqlDriver): AppDatabase {
    val database = AppDatabase(sqlDriver)

    // Do more work with the database (see below).
    return database
}

internal const val databaseFilename = "app.db"