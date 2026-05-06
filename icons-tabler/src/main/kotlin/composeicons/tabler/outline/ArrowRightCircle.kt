package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowRightCircle: ImageVector
    get() {
        if (_arrowRightCircle != null) return _arrowRightCircle!!
        _arrowRightCircle = tablerOutlineIcon(
            name = "ArrowRightCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 15l3-3L18 9")
            addPathData("M3 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C7 10.895 6.105 10 5 10c-1.105 0-2 .895-2 2")
            addPathData("M7 12h14")
        }
        return _arrowRightCircle!!
    }

private var _arrowRightCircle: ImageVector? = null
