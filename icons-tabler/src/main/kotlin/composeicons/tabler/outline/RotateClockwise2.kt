package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RotateClockwise2: ImageVector
    get() {
        if (_rotateClockwise2 != null) return _rotateClockwise2!!
        _rotateClockwise2 = tablerOutlineIcon(
            name = "RotateClockwise2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 4.55C13.115 2.893 17.793 4.885 19.45 9c1.657 4.115-.335 8.793-4.45 10.45M15 15v5h5")
            addPathData("M5.63 7.16v.01")
            addPathData("M4.06 11v.01")
            addPathData("M4.63 15.1v.01")
            addPathData("M7.16 18.37v.01")
            addPathData("M11 19.94v.01")
        }
        return _rotateClockwise2!!
    }

private var _rotateClockwise2: ImageVector? = null
