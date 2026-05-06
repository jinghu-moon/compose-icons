package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowRightRhombus: ImageVector
    get() {
        if (_arrowRightRhombus != null) return _arrowRightRhombus!!
        _arrowRightRhombus = tablerOutlineIcon(
            name = "ArrowRightRhombus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 12h13")
            addPathData("M18 9l3 3-3 3")
            addPathData("M5.5 9.5 3 12l2.5 2.5L8 12 5.5 9.5")
        }
        return _arrowRightRhombus!!
    }

private var _arrowRightRhombus: ImageVector? = null
