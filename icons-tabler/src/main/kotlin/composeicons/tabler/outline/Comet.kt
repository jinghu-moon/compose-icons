package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Comet: ImageVector
    get() {
        if (_comet != null) return _comet!!
        _comet = tablerOutlineIcon(
            name = "Comet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.5 18.5l-3 1.5L13 16.5l-2-2L14 14l1.5-3L17 14l3 .5-2 2L18.5 20l-3-1.5")
            addPathData("M4 4l7 7")
            addPathData("M9 4l3.5 3.5")
            addPathData("M4 9l3.5 3.5")
        }
        return _comet!!
    }

private var _comet: ImageVector? = null
