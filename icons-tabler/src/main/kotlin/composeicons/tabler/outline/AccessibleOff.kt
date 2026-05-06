package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AccessibleOff: ImageVector
    get() {
        if (_accessibleOff != null) return _accessibleOff!!
        _accessibleOff = tablerOutlineIcon(
            name = "AccessibleOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 16.5l2-3 2 3M12 13.5v-1.5M14.627 10.624 15 10.5 9 10.5l2.231 .744")
            addPathData("M20.042 16.045C21.79 12.576 21.115 8.378 18.368 5.632 15.622 2.885 11.424 2.21 7.955 3.958M5.637 5.635C3.332 7.902 2.42 11.231 3.248 14.356c.828 3.125 3.268 5.566 6.393 6.395 3.125 .829 6.454-.082 8.722-2.386")
            addPathData("M12 8c.276 0 .5-.224 .5-.5C12.5 7.224 12.276 7 12 7c-.276 0-.5 .224-.5 .5")
            addPathData("M3 3 21 21")
        }
        return _accessibleOff!!
    }

private var _accessibleOff: ImageVector? = null
