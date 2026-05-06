package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sailboat2: ImageVector
    get() {
        if (_sailboat2 != null) return _sailboat2!!
        _sailboat2 = tablerOutlineIcon(
            name = "Sailboat2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 20c.461 .643 1.209 1.017 2 1 .791 .017 1.539-.357 2-1 .461-.643 1.209-1.017 2-1 .791-.017 1.539 .357 2 1 .461 .643 1.209 1.017 2 1 .791 .017 1.539-.357 2-1 .461-.643 1.209-1.017 2-1 .791-.017 1.539 .357 2 1 .461 .643 1.209 1.017 2 1 .791 .017 1.539-.357 2-1")
            addPathData("M4 18 3 15h18l-1 3")
            addPathData("M12 11v4")
            addPathData("M7 3c1.333 2.667 1.333 5.333 0 8h10C18.333 8.333 18.333 5.667 17 3")
            addPathData("M6 3h12")
        }
        return _sailboat2!!
    }

private var _sailboat2: ImageVector? = null
