package com.nimyears.nowandroid.ui.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.nimyears.nowandroid.ui.screen.save.SaveScreen

const val saveRoute = "save_route/"

fun NavController.navigateToSave(navOptions: NavOptions? = null) {
    this.navigate(saveRoute, navOptions)
}

fun NavGraphBuilder.saveScreen() {
    composable(
        route = saveRoute,
        deepLinks = listOf(
            // navDeepLink { },
        ),
        arguments = listOf(
//            navArgument {
//                type = NavType.StringType
//            },
        ),
    ) {
        SaveScreen()
    }
}