package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Csv: ImageVector
    get() {
        if (_csv != null) return _csv!!
        _csv = tablerOutlineIcon(
            name = "Csv",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 15c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-2c0-.552-.448-1-1-1h-2c-.552 0-1-.448-1-1v-2c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1")
            addPathData("M17 8l2 8L21 8")
            addPathData("M7 10C7 8.895 6.105 8 5 8 3.895 8 3 8.895 3 10v4c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
        }
        return _csv!!
    }

private var _csv: ImageVector? = null
