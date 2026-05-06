package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HelmetOff: ImageVector
    get() {
        if (_helmetOff != null) return _helmetOff!!
        _helmetOff = tablerOutlineIcon(
            name = "HelmetOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.633 4.654c3.345-1.349 7.173-.57 9.725 1.978 2.552 2.549 3.337 6.375 1.993 9.722M18.848 18.84c-.361 .423-.76 .811-1.192 1.16h-11.312C4.262 18.318 3.037 15.796 3.001 13.12 2.966 10.444 4.123 7.89 6.159 6.153")
            addPathData("M20 9h-7M10.232 10.246c.507 2 1.596 3.418 3.268 4.254 .524 .262 1.07 .49 1.64 .683")
            addPathData("M3 3 21 21")
        }
        return _helmetOff!!
    }

private var _helmetOff: ImageVector? = null
