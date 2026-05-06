package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowRight: ImageVector
    get() {
        if (_arrowRight != null) return _arrowRight!!
        _arrowRight = tablerOutlineIcon(
            name = "ArrowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 12h14")
            addPathData("M13 18l6-6")
            addPathData("M13 6l6 6")
        }
        return _arrowRight!!
    }

private var _arrowRight: ImageVector? = null
