package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapOff: ImageVector
    get() {
        if (_mapOff != null) return _mapOff!!
        _mapOff = tablerOutlineIcon(
            name = "MapOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.32 4.34 9 4l6 3L21 4v13M18.33 18.335 15 20 9 17 3 20v-13L5.665 5.667")
            addPathData("M9 4v1M9 9v8")
            addPathData("M15 7v4M15 15v5")
            addPathData("M3 3 21 21")
        }
        return _mapOff!!
    }

private var _mapOff: ImageVector? = null
