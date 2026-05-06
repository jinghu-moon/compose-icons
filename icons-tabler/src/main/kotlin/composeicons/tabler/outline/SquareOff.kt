package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquareOff: ImageVector
    get() {
        if (_squareOff != null) return _squareOff!!
        _squareOff = tablerOutlineIcon(
            name = "SquareOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4h10c1.105 0 2 .895 2 2v10M19.416 19.412c-.375 .376-.885 .588-1.416 .588h-12C4.895 20 4 19.105 4 18v-12C4 5.448 4.224 4.948 4.586 4.586")
            addPathData("M3 3 21 21")
        }
        return _squareOff!!
    }

private var _squareOff: ImageVector? = null
