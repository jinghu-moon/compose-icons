package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowWaveLeftUp: ImageVector
    get() {
        if (_arrowWaveLeftUp != null) return _arrowWaveLeftUp!!
        _arrowWaveLeftUp = tablerOutlineIcon(
            name = "ArrowWaveLeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 10h-4v4")
            addPathData("M21 12C20.113 10.715 18.52 9.967 17 10c-1.52-.033-3.113 .715-4 2-.887 1.284-2.48 2.033-4 2C7.48 14.033 6 13 5 12L3 10")
        }
        return _arrowWaveLeftUp!!
    }

private var _arrowWaveLeftUp: ImageVector? = null
