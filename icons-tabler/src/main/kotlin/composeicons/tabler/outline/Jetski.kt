package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Jetski: ImageVector
    get() {
        if (_jetski != null) return _jetski!!
        _jetski = tablerOutlineIcon(
            name = "Jetski",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 5h1.4c.369 0 .708 .204 .882 .53L14 8.75")
            addPathData("M3.485 16.94l.136 .545c.223 .89 1.022 1.515 1.94 1.515h7.439c3.148 0 6.111-1.482 8-4C21 9 16 7 16 7c-1.889 2.518-5.852 4-9 4h-2c-1.105 0-2 .895-2 2 0 1.328 .163 2.652 .485 3.94")
            addPathData("M3.25 15h17.75")
        }
        return _jetski!!
    }

private var _jetski: ImageVector? = null
