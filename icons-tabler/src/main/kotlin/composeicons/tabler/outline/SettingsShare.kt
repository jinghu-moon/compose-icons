package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SettingsShare: ImageVector
    get() {
        if (_settingsShare != null) return _settingsShare!!
        _settingsShare = tablerOutlineIcon(
            name = "SettingsShare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.004 21c-.732 .002-1.466-.437-1.679-1.317-.13-.535-.507-.976-1.016-1.187-.509-.211-1.087-.166-1.557 .121C6.209 19.557 4.442 17.791 5.382 16.247c.286-.47 .331-1.048 .12-1.556-.21-.508-.651-.886-1.185-1.016-1.756-.426-1.756-2.924 0-3.35 .535-.13 .976-.507 1.187-1.016C5.714 8.801 5.67 8.222 5.383 7.752 4.443 6.209 6.209 4.442 7.753 5.382c1 .608 2.296 .07 2.572-1.065 .426-1.756 2.924-1.756 3.35 0 .13 .535 .507 .976 1.016 1.187 .509 .211 1.087 .166 1.557-.121 1.543-.94 3.31 .826 2.37 2.37-.286 .47-.331 1.048-.12 1.556 .21 .508 .651 .886 1.185 1.016 1.306 .317 1.64 1.78 1.004 2.684")
            addPathData("M12 15c1.657 0 3-1.343 3-3C15 10.343 13.657 9 12 9 10.343 9 9 10.343 9 12c0 1.657 1.343 3 3 3")
            addPathData("M16 22l5-5")
            addPathData("M21 21.5v-4.5h-4.5")
        }
        return _settingsShare!!
    }

private var _settingsShare: ImageVector? = null
