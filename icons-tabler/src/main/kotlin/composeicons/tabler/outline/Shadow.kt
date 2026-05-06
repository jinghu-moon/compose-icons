package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Shadow: ImageVector
    get() {
        if (_shadow != null) return _shadow!!
        _shadow = tablerOutlineIcon(
            name = "Shadow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M13 12h5")
            addPathData("M13 15h4")
            addPathData("M13 18h1")
            addPathData("M13 9h4")
            addPathData("M13 6h1")
        }
        return _shadow!!
    }

private var _shadow: ImageVector? = null
