package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TriangleSquareCircle: ImageVector
    get() {
        if (_triangleSquareCircle != null) return _triangleSquareCircle!!
        _triangleSquareCircle = tablerOutlineIcon(
            name = "TriangleSquareCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3 8 10h8L12 3")
            addPathData("M14 17c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M4 15c0-.552 .448-1 1-1h4c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-4C4.448 20 4 19.552 4 19v-4")
        }
        return _triangleSquareCircle!!
    }

private var _triangleSquareCircle: ImageVector? = null
