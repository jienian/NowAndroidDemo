package com.nimyears.nowandroid.ui.navigation

import androidx.compose.ui.graphics.vector.ImageVector
import com.nimyears.nowandroid.ui.component.AppIcons

/**
 * Type for the top level destinations in the application. Each of these destinations
 * can contain one or more screens (based on the window size). Navigation from one screen to the
 * next within a single destination will be handled directly in composables.
 */
enum class TopLevelDestination(
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val iconText: String,
    val titleText: String,
) {
    MUSIC(
        selectedIcon = AppIcons.Music,
        unselectedIcon = AppIcons.MusicBroder,
        iconText = "Music",
        titleText = "Music"
    ),
    SAVE(
        selectedIcon = AppIcons.Bookmark,
        unselectedIcon = AppIcons.BookmarkBroder,
        iconText = "Save",
        titleText = "Save"
    ),
    SETTINGS(
        selectedIcon = AppIcons.Setting,
        unselectedIcon = AppIcons.SettingBroder,
        iconText = "Settings",
        titleText = "Settings"
    )
}