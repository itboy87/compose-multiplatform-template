package ui

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp


@Composable
fun CaptionText(
    text: String,
    modifier: Modifier = Modifier,
    style: TextStyle = TextStyle(Color.Gray, fontSize = 12.sp, textAlign = TextAlign.Center)
) {
    Text(text, modifier = modifier, style = style)
}