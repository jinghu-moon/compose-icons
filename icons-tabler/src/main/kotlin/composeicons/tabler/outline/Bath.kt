package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bath: ImageVector
    get() {
        if (_bath != null) return _bath!!
        _bath = tablerOutlineIcon(
            name = "Bath",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12h16c.552 0 1 .448 1 1v3c0 2.209-1.791 4-4 4h-10C4.791 20 3 18.209 3 16v-3c0-.552 .448-1 1-1")
            addPathData("M6 12v-7C6 3.895 6.895 3 8 3h3v2.25")
            addPathData("M4 21 5 19.5")
            addPathData("M20 21 19 19.5")
        }
        return _bath!!
    }

private var _bath: ImageVector? = null
