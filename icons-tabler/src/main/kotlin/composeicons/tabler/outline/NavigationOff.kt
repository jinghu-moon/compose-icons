package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NavigationOff: ImageVector
    get() {
        if (_navigationOff != null) return _navigationOff!!
        _navigationOff = tablerOutlineIcon(
            name = "NavigationOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.28 12.28C15.33 10.216 13.903 7.123 12 3c-.7 1.515-1.223 2.652-1.573 3.41M9.157 9.16C8.275 11.073 6.567 14.778 4.03 20.275c-.07 .2-.017 .424 .135 .572 .15 .148 .374 .193 .57 .116L12 18.5l7.265 2.463c.196 .077 .42 .032 .57-.116 .152-.149 .204-.371 .134-.572l-.26-.563")
            addPathData("M3 3 21 21")
        }
        return _navigationOff!!
    }

private var _navigationOff: ImageVector? = null
