package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowRightBar: ImageVector
    get() {
        if (_arrowRightBar != null) return _arrowRightBar!!
        _arrowRightBar = tablerOutlineIcon(
            name = "ArrowRightBar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 15l3-3L18 9")
            addPathData("M3 12h18")
            addPathData("M3 9v6")
        }
        return _arrowRightBar!!
    }

private var _arrowRightBar: ImageVector? = null
