package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Old: ImageVector
    get() {
        if (_old != null) return _old!!
        _old = tablerOutlineIcon(
            name = "Old",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 21 10 17 8 14v-6")
            addPathData("M5 14 4 11 8 8l3 2 3 .5")
            addPathData("M7 4c0 .552 .448 1 1 1C8.552 5 9 4.552 9 4 9 3.448 8.552 3 8 3 7.448 3 7 3.448 7 4")
            addPathData("M7 17 5 21")
            addPathData("M16 21v-8.5C16 11.672 16.672 11 17.5 11c.828 0 1.5 .672 1.5 1.5v.5")
        }
        return _old!!
    }

private var _old: ImageVector? = null
