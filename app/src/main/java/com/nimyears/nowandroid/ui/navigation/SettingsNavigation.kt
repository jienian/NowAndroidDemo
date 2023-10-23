package com.nimyears.nowandroid.ui.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.nimyears.nowandroid.ui.screen.settings.SettingsScreen

const val settingsRoute = "settings_route/"

fun NavController.navigateToSettings(navOptions: NavOptions? = null) {
    this.navigate(settingsRoute, navOptions)
}

fun NavGraphBuilder.settingsScreen() {
    composable(
        route = settingsRoute,
        deepLinks = listOf(
            // navDeepLink { },
        ),
        arguments = listOf(
//            navArgument {
//                type = NavType.StringType
//            },
        ),
    ) {
        SettingsScreen()
    }
}