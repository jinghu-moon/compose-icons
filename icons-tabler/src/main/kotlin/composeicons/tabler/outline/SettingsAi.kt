package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SettingsAi: ImageVector
    get() {
        if (_settingsAi != null) return _settingsAi!!
        _settingsAi = tablerOutlineIcon(
            name = "SettingsAi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.325 4.317c.426-1.756 2.924-1.756 3.35 0 .13 .535 .507 .976 1.016 1.187 .509 .211 1.087 .166 1.557-.121 1.543-.94 3.31 .826 2.37 2.37-.286 .47-.331 1.048-.12 1.556 .21 .508 .651 .886 1.185 1.016 1.756 .426 1.756 2.924 0 3.35-.535 .13-.976 .507-1.187 1.016-.211 .509-.166 1.087 .121 1.557 .94 1.543-.826 3.31-2.37 2.37-.47-.286-1.048-.331-1.556-.12-.508 .21-.886 .651-1.016 1.185-.426 1.756-2.924 1.756-3.35 0-.13-.535-.507-.976-1.016-1.187-.509-.211-1.087-.166-1.557 .121C6.209 19.557 4.442 17.791 5.382 16.247c.286-.47 .331-1.048 .12-1.556-.21-.508-.651-.886-1.185-1.016-1.756-.426-1.756-2.924 0-3.35 .535-.13 .976-.507 1.187-1.016C5.714 8.801 5.67 8.222 5.383 7.752 4.443 6.209 6.209 4.442 7.753 5.382c1 .608 2.296 .07 2.572-1.065")
            addPathData("M9 14v-2.5C9 10.672 9.672 10 10.5 10c.828 0 1.5 .672 1.5 1.5v2.5")
            addPathData("M9 13h3")
            addPathData("M15 10v4")
        }
        return _settingsAi!!
    }

private var _settingsAi: ImageVector? = null
