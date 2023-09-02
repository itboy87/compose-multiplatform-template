import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun AppTheme(content: @Composable () -> Unit) {
    MaterialTheme(colors = DarkColors) {
        content()
    }
}

val DarkColors = darkColors(
    primary = Color(0xfff44336),
    onPrimary = Color.White,
    background = Color(0xff1a1a1a),
    secondary = Color.White
)