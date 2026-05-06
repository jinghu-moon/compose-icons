package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bat: ImageVector
    get() {
        if (_bat != null) return _bat!!
        _bat = tablerOutlineIcon(
            name = "Bat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 16c.74-2.286 2.778-3.762 5-3-.173-2.595 .13-5.314-2-7.5C18.292 8.148 16.642 8.057 15 8v-4L12 6 9 4v4C7.358 8.057 5.708 8.148 4 5.5 1.87 7.686 2.173 10.405 2 13c2.222-.762 4.26 .714 5 3 2.593 0 3.889 .952 5 4 1.111-3.048 2.407-4 5-4")
            addPathData("M9 8c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3")
        }
        return _bat!!
    }

private var _bat: ImageVector? = null
