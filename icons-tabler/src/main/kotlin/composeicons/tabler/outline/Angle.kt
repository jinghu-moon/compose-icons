package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Angle: ImageVector
    get() {
        if (_angle != null) return _angle!!
        _angle = tablerOutlineIcon(
            name = "Angle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 19h-18L12 4")
            addPathData("M20.615 15.171h.015")
            addPathData("M19.515 11.771h.015")
            addPathData("M17.715 8.671h.015")
            addPathData("M15.415 5.971h.015")
        }
        return _angle!!
    }

private var _angle: ImageVector? = null
