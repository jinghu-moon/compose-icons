package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SettingsOff: ImageVector
    get() {
        if (_settingsOff != null) return _settingsOff!!
        _settingsOff = tablerOutlineIcon(
            name = "SettingsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.451 5.437c.418-.218 .75-.609 .874-1.12 .426-1.756 2.924-1.756 3.35 0 .13 .535 .507 .976 1.016 1.187 .509 .211 1.087 .166 1.557-.121 1.543-.94 3.31 .826 2.37 2.37-.286 .47-.331 1.048-.12 1.556 .21 .508 .651 .886 1.185 1.016 1.756 .426 1.756 2.924 0 3.35-.486 .118-.894 .44-1.123 .878M18.372 18.356c-.517 .523-1.349 .734-2.125 .262-.47-.286-1.048-.331-1.556-.12-.508 .21-.886 .651-1.016 1.185-.426 1.756-2.924 1.756-3.35 0-.13-.535-.507-.976-1.016-1.187-.509-.211-1.087-.166-1.557 .121C6.209 19.557 4.442 17.791 5.382 16.247c.286-.47 .331-1.048 .12-1.556-.21-.508-.651-.886-1.185-1.016-1.756-.426-1.756-2.924 0-3.35 .535-.13 .976-.507 1.187-1.016C5.714 8.801 5.67 8.222 5.383 7.752 4.911 6.978 5.121 6.148 5.642 5.631")
            addPathData("M9.889 9.869c-1.176 1.167-1.184 3.067-.017 4.243 1.167 1.176 3.067 1.184 4.243 .017M14.707 10.705c-.298-.62-.798-1.119-1.419-1.415")
            addPathData("M3 3 21 21")
        }
        return _settingsOff!!
    }

private var _settingsOff: ImageVector? = null
