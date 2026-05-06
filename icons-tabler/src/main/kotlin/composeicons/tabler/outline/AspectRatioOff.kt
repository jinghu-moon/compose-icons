package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AspectRatioOff: ImageVector
    get() {
        if (_aspectRatioOff != null) return _aspectRatioOff!!
        _aspectRatioOff = tablerOutlineIcon(
            name = "AspectRatioOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 5h10c1.105 0 2 .895 2 2v10M19 19h-14C3.895 19 3 18.105 3 17v-10C3 5.895 3.895 5 5 5")
            addPathData("M7 12v-3h2")
            addPathData("M17 12v1M15 15h-1")
            addPathData("M3 3 21 21")
        }
        return _aspectRatioOff!!
    }

private var _aspectRatioOff: ImageVector? = null
