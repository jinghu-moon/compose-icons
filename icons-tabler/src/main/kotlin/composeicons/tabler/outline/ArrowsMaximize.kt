package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsMaximize: ImageVector
    get() {
        if (_arrowsMaximize != null) return _arrowsMaximize!!
        _arrowsMaximize = tablerOutlineIcon(
            name = "ArrowsMaximize",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 4h4v4")
            addPathData("M14 10 20 4")
            addPathData("M8 20h-4v-4")
            addPathData("M4 20l6-6")
            addPathData("M16 20h4v-4")
            addPathData("M14 14l6 6")
            addPathData("M8 4h-4v4")
            addPathData("M4 4l6 6")
        }
        return _arrowsMaximize!!
    }

private var _arrowsMaximize: ImageVector? = null
