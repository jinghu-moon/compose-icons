package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Container: ImageVector
    get() {
        if (_container != null) return _container!!
        _container = tablerOutlineIcon(
            name = "Container",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 4v.01")
            addPathData("M20 20v.01")
            addPathData("M20 16v.01")
            addPathData("M20 12v.01")
            addPathData("M20 8v.01")
            addPathData("M8 5C8 4.448 8.448 4 9 4h6c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-6C8.448 20 8 19.552 8 19v-14")
            addPathData("M4 4v.01")
            addPathData("M4 20v.01")
            addPathData("M4 16v.01")
            addPathData("M4 12v.01")
            addPathData("M4 8v.01")
        }
        return _container!!
    }

private var _container: ImageVector? = null
