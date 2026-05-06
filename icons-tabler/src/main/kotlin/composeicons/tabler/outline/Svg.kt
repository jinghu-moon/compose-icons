package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Svg: ImageVector
    get() {
        if (_svg != null) return _svg!!
        _svg = tablerOutlineIcon(
            name = "Svg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 8h-2c-1.105 0-2 .895-2 2v4c0 1.105 .895 2 2 2h2v-4h-1")
            addPathData("M7 8h-3C3.448 8 3 8.448 3 9v2c0 .552 .448 1 1 1h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-3")
            addPathData("M10 8l1.5 8h1L14 8")
        }
        return _svg!!
    }

private var _svg: ImageVector? = null
