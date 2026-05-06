package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PointOff: ImageVector
    get() {
        if (_pointOff != null) return _pointOff!!
        _pointOff = tablerOutlineIcon(
            name = "PointOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.15 9.194c-1.551 1.573-1.533 4.106 .04 5.657 1.573 1.551 4.106 1.533 5.657-.04M16 12C16 9.791 14.209 8 12 8")
            addPathData("M3 3 21 21")
        }
        return _pointOff!!
    }

private var _pointOff: ImageVector? = null
