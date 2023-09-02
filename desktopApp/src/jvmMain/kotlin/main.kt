import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import di.initKoinDesktop
import moe.tlaster.precompose.PreComposeWindow

fun main() = application {
    initKoinDesktop()
    PreComposeWindow(onCloseRequest = ::exitApplication) {
        MainView()
    }
}