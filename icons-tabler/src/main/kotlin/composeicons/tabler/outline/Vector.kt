package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Vector: ImageVector
    get() {
        if (_vector != null) return _vector!!
        _vector = tablerOutlineIcon(
            name = "Vector",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 4C3 3.448 3.448 3 4 3h2c.552 0 1 .448 1 1v2C7 6.552 6.552 7 6 7h-2C3.448 7 3 6.552 3 6v-2")
            addPathData("M17 4c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2C17.448 7 17 6.552 17 6v-2")
            addPathData("M17 18c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-2")
            addPathData("M3 18c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2C3.448 21 3 20.552 3 20v-2")
            addPathData("M5 7v10")
            addPathData("M19 7v10")
            addPathData("M7 5h10")
            addPathData("M7 19h10")
        }
        return _vector!!
    }

private var _vector: ImageVector? = null
