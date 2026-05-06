package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapX: ImageVector
    get() {
        if (_mapX != null) return _mapX!!
        _mapX = tablerOutlineIcon(
            name = "MapX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 19.5 9 17 3 20v-13L9 4l6 3L21 4v9")
            addPathData("M9 4v13")
            addPathData("M15 7v6.5")
            addPathData("M22 22 17 17")
            addPathData("M17 22l5-5")
        }
        return _mapX!!
    }

private var _mapX: ImageVector? = null
