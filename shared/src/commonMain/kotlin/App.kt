import androidx.compose.foundation.clickable
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.NavOptions
import moe.tlaster.precompose.navigation.rememberNavigator
import ui.screens.LoginScreen

@Composable
fun App() {
    AppTheme {
        val navigator = rememberNavigator()
        NavHost(navigator = navigator, initialRoute = "/login") {
            scene("/") {
                Text(
                    "Home",
                    modifier = Modifier.clickable {
                        navigator.navigate(
                            "/login",
                            NavOptions(launchSingleTop = true)
                        )
                    })
            }
            scene("/settings") {
                Text("Settings")
            }
            scene("/login") {
                LoginScreen()
            }
        }
    }
//        AsyncImage("https://picsum.photos/200/300")
    //        val dataStore = koinInject<DataStore<Preferences>>()
    /*var greetingText by remember { mutableStateOf("Hello, World!") }
    var showImage by remember { mutableStateOf(false) }
    Column(Modifier.fillMaxWidth(), horizontalAlignment = Ali   gnment.CenterHorizontally) {
        Button(onClick = {
            greetingText = "Hello, ${getPlatformName()}"
            showImage = !showImage
        }) {
            Text(greetingText)
        }
        AnimatedVisibility(showImage) {
            Image(
                painterResource("compose-multiplatform.xml"),
                null
            )
        }
    }*/
}