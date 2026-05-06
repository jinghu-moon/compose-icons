package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowBackUpDouble: ImageVector
    get() {
        if (_arrowBackUpDouble != null) return _arrowBackUpDouble!!
        _arrowBackUpDouble = tablerOutlineIcon(
            name = "ArrowBackUpDouble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 14 9 10 13 6")
            addPathData("M8 14 4 10 8 6")
            addPathData("M9 10h7c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-1")
        }
        return _arrowBackUpDouble!!
    }

private var _arrowBackUpDouble: ImageVector? = null
