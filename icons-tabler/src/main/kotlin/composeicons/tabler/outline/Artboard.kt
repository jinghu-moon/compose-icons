package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Artboard: ImageVector
    get() {
        if (_artboard != null) return _artboard!!
        _artboard = tablerOutlineIcon(
            name = "Artboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 9C8 8.448 8.448 8 9 8h6c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-6C8.448 16 8 15.552 8 15v-6")
            addPathData("M3 8h1")
            addPathData("M3 16h1")
            addPathData("M8 3v1")
            addPathData("M16 3v1")
            addPathData("M20 8h1")
            addPathData("M20 16h1")
            addPathData("M8 20v1")
            addPathData("M16 20v1")
        }
        return _artboard!!
    }

private var _artboard: ImageVector? = null
