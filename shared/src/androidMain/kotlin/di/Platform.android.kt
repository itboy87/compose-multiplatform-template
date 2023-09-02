package di

import android.content.Intent
import app.cash.sqldelight.db.SqlDriver
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.okhttp.OkHttp
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module

actual fun platformModule() = module {
    single<HttpClientEngine> {
        OkHttp.create {
            addInterceptor(HttpLoggingInterceptor())
        }
    }
    single { provideDataStore(get()) }
    single<SqlDriver> { provideSqlDriver(get()) }
}

actual fun browseUrl(url: String) {
    Intent(Intent.ACTION_VIEW)
}