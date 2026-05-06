package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapShare: ImageVector
    get() {
        if (_mapShare != null) return _mapShare!!
        _mapShare = tablerOutlineIcon(
            name = "MapShare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 19 9 17 3 20v-13L9 4l6 3L21 4v9")
            addPathData("M9 4v13")
            addPathData("M15 7v6.5")
            addPathData("M16 22l5-5")
            addPathData("M21 21.5v-4.5h-4.5")
        }
        return _mapShare!!
    }

private var _mapShare: ImageVector? = null
