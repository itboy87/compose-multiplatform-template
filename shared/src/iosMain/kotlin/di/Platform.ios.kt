package di

import app.cash.sqldelight.db.SqlDriver
import io.ktor.client.engine.darwin.*
import org.koin.dsl.module

actual fun platformModule() = module {
    single { Darwin.create() }
    single { provideDataStore() }
//    single<SqlDriver> { provideSqlDriver() }
}


actual fun browseUrl(url: String) {
}