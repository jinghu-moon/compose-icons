package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Yoga: ImageVector
    get() {
        if (_yoga != null) return _yoga!!
        _yoga = tablerOutlineIcon(
            name = "Yoga",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 4c0 .552 .448 1 1 1 .552 0 1-.448 1-1C13 3.448 12.552 3 12 3c-.552 0-1 .448-1 1")
            addPathData("M4 20h4L9.5 17")
            addPathData("M17 20 16 15h-5L12 8")
            addPathData("M4 10 8 9 12 8l4 1.5L20 11")
        }
        return _yoga!!
    }

private var _yoga: ImageVector? = null
