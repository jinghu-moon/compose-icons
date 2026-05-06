package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowWaveRightUp: ImageVector
    get() {
        if (_arrowWaveRightUp != null) return _arrowWaveRightUp!!
        _arrowWaveRightUp = tablerOutlineIcon(
            name = "ArrowWaveRightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 10h4v4")
            addPathData("M3 12C3.887 10.716 5.48 9.967 7 10c1.52-.033 3.113 .716 4 2 .887 1.284 2.48 2.033 4 2 1.52 .033 3-1 4-2l2-2")
        }
        return _arrowWaveRightUp!!
    }

private var _arrowWaveRightUp: ImageVector? = null
