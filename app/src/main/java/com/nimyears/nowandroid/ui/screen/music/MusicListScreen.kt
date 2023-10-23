package com.nimyears.nowandroid.ui.screen.music

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.nimyears.nowandroid.ui.theme.Purple90

@Composable
fun MusicScreen(onMusicClick: (String) -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    listOf(
                        Color.Transparent,
                        Purple90
                    )
                )
            )
    ) {
        Text(text = "This is MusicListScreen")
    }
}