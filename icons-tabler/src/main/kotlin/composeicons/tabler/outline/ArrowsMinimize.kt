package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsMinimize: ImageVector
    get() {
        if (_arrowsMinimize != null) return _arrowsMinimize!!
        _arrowsMinimize = tablerOutlineIcon(
            name = "ArrowsMinimize",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 9h4v-4")
            addPathData("M3 3 9 9")
            addPathData("M5 15h4v4")
            addPathData("M3 21 9 15")
            addPathData("M19 9h-4v-4")
            addPathData("M15 9 21 3")
            addPathData("M19 15h-4v4")
            addPathData("M15 15l6 6")
        }
        return _arrowsMinimize!!
    }

private var _arrowsMinimize: ImageVector? = null
