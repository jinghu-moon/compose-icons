package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapCheck: ImageVector
    get() {
        if (_mapCheck != null) return _mapCheck!!
        _mapCheck = tablerOutlineIcon(
            name = "MapCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 18 9 17 3 20v-13L9 4l6 3L21 4v9")
            addPathData("M9 4v13")
            addPathData("M15 7v8")
            addPathData("M15 19l2 2 4-4")
        }
        return _mapCheck!!
    }

private var _mapCheck: ImageVector? = null
