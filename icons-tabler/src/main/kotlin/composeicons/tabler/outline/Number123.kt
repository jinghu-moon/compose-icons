package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number123: ImageVector
    get() {
        if (_number123 != null) return _number123!!
        _number123 = tablerOutlineIcon(
            name = "Number123",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 10 5 8v8")
            addPathData("M9 8h3c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2c-.552 0-1 .448-1 1v2c0 .552 .448 1 1 1h3")
            addPathData("M17 8h2.5C20.328 8 21 8.672 21 9.5v1C21 11.328 20.328 12 19.5 12h-1.5 1.5c.828 0 1.5 .672 1.5 1.5v1C21 15.328 20.328 16 19.5 16h-2.5")
        }
        return _number123!!
    }

private var _number123: ImageVector? = null
