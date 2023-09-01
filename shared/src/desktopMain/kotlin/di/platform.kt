package di

import app.cash.sqldelight.db.SqlDriver
import io.ktor.client.engine.config
import io.ktor.client.engine.okhttp.OkHttp
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module

actual fun platformModule() = module {
    single {
        OkHttp.config {
            addInterceptor(HttpLoggingInterceptor())
        }
    }
    single { provideDataStore() }
    single<SqlDriver> { provideSqlDriver() }
}