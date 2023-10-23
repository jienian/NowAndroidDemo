package com.nimyears.nowandroid.ui.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.nimyears.nowandroid.ui.screen.music.MusicScreen

const val musicListRoute = "music_list_route/"

fun NavController.navigateToMusicList(navOptions: NavOptions? = null) {
    this.navigate(musicListRoute, navOptions)
}

fun NavGraphBuilder.musicScreen(onMusicClick: (String) -> Unit = {}) {
    composable(
        route = musicListRoute,
        deepLinks = listOf(
            // navDeepLink { },
        ),
        arguments = listOf(
//            navArgument {
//                type = NavType.StringType
//            },
        ),
    ) {
        MusicScreen(onMusicClick)
    }
}