package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsDiff: ImageVector
    get() {
        if (_arrowsDiff != null) return _arrowsDiff!!
        _arrowsDiff = tablerOutlineIcon(
            name = "ArrowsDiff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 16h10")
            addPathData("M11 16l4 4")
            addPathData("M11 16l4-4")
            addPathData("M13 8h-10")
            addPathData("M13 8 9 12")
            addPathData("M13 8 9 4")
        }
        return _arrowsDiff!!
    }

private var _arrowsDiff: ImageVector? = null
