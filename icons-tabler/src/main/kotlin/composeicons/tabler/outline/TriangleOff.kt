package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TriangleOff: ImageVector
    get() {
        if (_triangleOff != null) return _triangleOff!!
        _triangleOff = tablerOutlineIcon(
            name = "TriangleOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7.825 7.83 2.257 17.125c-.34 .589-.342 1.314-.005 1.905 .337 .591 .962 .959 1.641 .966h16.107M21.998 18.006c-.012-.31-.1-.612-.255-.88L13.637 3.59C13.29 3.017 12.669 2.668 12 2.668c-.669 0-1.29 .35-1.637 .922L9.335 5.308")
            addPathData("M3 3 21 21")
        }
        return _triangleOff!!
    }

private var _triangleOff: ImageVector? = null
