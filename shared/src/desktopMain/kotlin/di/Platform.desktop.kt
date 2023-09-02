package di

import app.cash.sqldelight.db.SqlDriver
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.okhttp.OkHttp
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import java.awt.Desktop
import java.net.URI

actual fun platformModule() = module {
    single<HttpClientEngine> {
        OkHttp.create {
            addInterceptor(HttpLoggingInterceptor())
        }
    }
    single { provideDataStore() }
    single<SqlDriver> { provideSqlDriver() }
}

actual fun browseUrl(url: String) {
    Desktop.getDesktop().browse(URI(url))
}