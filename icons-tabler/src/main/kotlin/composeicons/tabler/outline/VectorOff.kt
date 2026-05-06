package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.VectorOff: ImageVector
    get() {
        if (_vectorOff != null) return _vectorOff!!
        _vectorOff = tablerOutlineIcon(
            name = "VectorOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.68 6.733C6.495 6.905 6.252 7 6 7h-2C3.448 7 3 6.552 3 6v-2c0-.276 .112-.527 .293-.708")
            addPathData("M17 4c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2C17.448 7 17 6.552 17 6v-2")
            addPathData("M20.72 20.693c-.188 .196-.448 .307-.72 .307h-2c-.552 0-1-.448-1-1v-2c0-.282 .116-.536 .304-.718")
            addPathData("M3 18c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2C3.448 21 3 20.552 3 20v-2")
            addPathData("M5 7v10")
            addPathData("M19 7v8")
            addPathData("M9 5h8")
            addPathData("M7 19h10")
            addPathData("M3 3 21 21")
        }
        return _vectorOff!!
    }

private var _vectorOff: ImageVector? = null
