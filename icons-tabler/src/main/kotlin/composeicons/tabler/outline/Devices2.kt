package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Devices2: ImageVector
    get() {
        if (_devices2 != null) return _devices2!!
        _devices2 = tablerOutlineIcon(
            name = "Devices2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 15h-6C3.448 15 3 14.552 3 14v-8C3 5.448 3.448 5 4 5h6")
            addPathData("M13 5c0-.552 .448-1 1-1h6c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-6c-.552 0-1-.448-1-1v-14")
            addPathData("M7 19h3")
            addPathData("M17 8v.01")
            addPathData("M16 16c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M9 15v4")
        }
        return _devices2!!
    }

private var _devices2: ImageVector? = null
