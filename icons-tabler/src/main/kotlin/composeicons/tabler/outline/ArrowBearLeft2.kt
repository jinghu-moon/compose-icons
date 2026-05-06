package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowBearLeft2: ImageVector
    get() {
        if (_arrowBearLeft2 != null) return _arrowBearLeft2!!
        _arrowBearLeft2 = tablerOutlineIcon(
            name = "ArrowBearLeft2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 3h-5v5")
            addPathData("M4 3l7.536 7.536c.937 .937 1.464 2.209 1.464 3.534v6.93")
            addPathData("M20 5 15.5 9.5")
        }
        return _arrowBearLeft2!!
    }

private var _arrowBearLeft2: ImageVector? = null
