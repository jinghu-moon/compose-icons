package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sleigh: ImageVector
    get() {
        if (_sleigh != null) return _sleigh!!
        _sleigh = tablerOutlineIcon(
            name = "Sleigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 19h15c2.209 0 4-1.791 4-4")
            addPathData("M16 15h-9C4.791 15 3 13.209 3 11v-6L4.243 6.243C5.368 7.368 6.894 8 8.485 8h3.515v2c0 1.105 .895 2 2 2h.5C15.328 12 16 11.328 16 10.5 16 9.672 16.672 9 17.5 9 18.328 9 19 9.672 19 10.5v1.5c0 1.657-1.343 3-3 3")
            addPathData("M15 15v4")
            addPathData("M7 15v4")
        }
        return _sleigh!!
    }

private var _sleigh: ImageVector? = null
