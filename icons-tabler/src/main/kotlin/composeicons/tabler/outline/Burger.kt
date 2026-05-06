package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Burger: ImageVector
    get() {
        if (_burger != null) return _burger!!
        _burger = tablerOutlineIcon(
            name = "Burger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 15h16c0 2.209-1.791 4-4 4h-8C5.791 19 4 17.209 4 15")
            addPathData("M12 4c3.783 0 6.953 2.133 7.786 5h-15.572C5.047 6.133 8.217 4 12 4")
            addPathData("M5 12h14")
        }
        return _burger!!
    }

private var _burger: ImageVector? = null
