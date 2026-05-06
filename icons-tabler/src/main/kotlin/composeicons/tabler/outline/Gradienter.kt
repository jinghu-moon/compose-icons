package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Gradienter: ImageVector
    get() {
        if (_gradienter != null) return _gradienter!!
        _gradienter = tablerOutlineIcon(
            name = "Gradienter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3.227 14c.917 4 4.497 7 8.773 7 4.277 0 7.858-3 8.773-7")
            addPathData("M20.78 10C19.846 5.903 16.202 2.998 12 3 7.795 2.991 4.147 5.899 3.218 10")
            addPathData("M10 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
        }
        return _gradienter!!
    }

private var _gradienter: ImageVector? = null
