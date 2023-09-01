import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import di.initKoinDesktop

fun main() = application {
    initKoinDesktop()
    Window(onCloseRequest = ::exitApplication) {
        MainView()
    }
}