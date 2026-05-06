package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Paint: ImageVector
    get() {
        if (_paint != null) return _paint!!
        _paint = tablerOutlineIcon(
            name = "Paint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 5C5 3.895 5.895 3 7 3h10c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-10C5.895 9 5 8.105 5 7v-2")
            addPathData("M19 6h1c1.105 0 2 .895 2 2 0 2.761-2.239 5-5 5h-5v2")
            addPathData("M10 16c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-4")
        }
        return _paint!!
    }

private var _paint: ImageVector? = null
