@file:OptIn(ExperimentalLayoutApi::class)

package ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Button
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import com.myapplication.common.Res
import di.browseUrl
import io.github.skeptick.libres.compose.painterResource
import ui.CaptionText

@Composable
fun LoginScreen() {
    Scaffold {
        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Column(
                modifier = Modifier.padding(horizontal = 60.dp, vertical = 40.dp).fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painterResource(Res.image.logo),
                    contentDescription = null,
                    modifier = Modifier.width(150.dp)
                )

                Spacer(modifier = Modifier.height(32.dp))

                TermsDeclareText()

                Spacer(modifier = Modifier.height(32.dp))

                CaptionText(Res.string.log_in_with_your_goolge_account_note)

                Spacer(modifier = Modifier.height(32.dp))

                LoginButtons()
            }
        }
    }
}

@Composable
private fun LoginButtons() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Button({}) {
            Text(Res.string.login_with_google)
        }
        Spacer(modifier = Modifier.height(16.dp))
        CaptionText(Res.string.or)
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedButton({}) {
            Text(Res.string.continue_without_account)
        }
    }
}

@Composable
private fun TermsDeclareText() {
    val annotatedString = buildAnnotatedString {
        append(Res.string.declare_to_accept)
        pushStringAnnotation("terms", "terms")
        withStyle(
            style = SpanStyle(
                color = Color(0xFFF44336),
                fontWeight = FontWeight.Bold
            )
        ) {
            appendLine(Res.string.terms_of_services)
        }
        pop()
    }
    ClickableText(
        annotatedString,
        style = TextStyle(color = Color.White, textAlign = TextAlign.Center),
        modifier = Modifier.pointerHoverIcon(PointerIcon.Hand)
    ) {
        browseUrl("https://www.jetbrains.com/lp/compose-multiplatform/")
    }
}