package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquareRotatedOff: ImageVector
    get() {
        if (_squareRotatedOff != null) return _squareRotatedOff!!
        _squareRotatedOff = tablerOutlineIcon(
            name = "SquareRotatedOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.964 16.952l-3.462 3.461c-.782 .783-2.222 .783-3 0L3.591 13.503c-.783-.783-.783-2.223 0-3L7.046 7.047M9.046 5.047 10.499 3.595c.782-.783 2.222-.783 3 0l6.911 6.91c.783 .783 .783 2.223 0 3l-1.448 1.45")
            addPathData("M3 3 21 21")
        }
        return _squareRotatedOff!!
    }

private var _squareRotatedOff: ImageVector? = null
