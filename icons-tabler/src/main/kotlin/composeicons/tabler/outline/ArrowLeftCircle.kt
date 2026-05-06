package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowLeftCircle: ImageVector
    get() {
        if (_arrowLeftCircle != null) return _arrowLeftCircle!!
        _arrowLeftCircle = tablerOutlineIcon(
            name = "ArrowLeftCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 12h-14")
            addPathData("M6 9 3 12l3 3")
            addPathData("M17 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
        }
        return _arrowLeftCircle!!
    }

private var _arrowLeftCircle: ImageVector? = null
