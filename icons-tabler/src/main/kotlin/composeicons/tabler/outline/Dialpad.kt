package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Dialpad: ImageVector
    get() {
        if (_dialpad != null) return _dialpad!!
        _dialpad = tablerOutlineIcon(
            name = "Dialpad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 3h2c.552 0 1 .448 1 1v2C7 6.552 6.552 7 6 7h-2C3.448 7 3 6.552 3 6v-2C3 3.448 3.448 3 4 3")
            addPathData("M18 3h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2C17.448 7 17 6.552 17 6v-2c0-.552 .448-1 1-1")
            addPathData("M11 3h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2C10.448 7 10 6.552 10 6v-2c0-.552 .448-1 1-1")
            addPathData("M4 10h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2C3.448 14 3 13.552 3 13v-2c0-.552 .448-1 1-1")
            addPathData("M18 10h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-2c0-.552 .448-1 1-1")
            addPathData("M11 10h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-2c0-.552 .448-1 1-1")
            addPathData("M11 17h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-2c0-.552 .448-1 1-1")
        }
        return _dialpad!!
    }

private var _dialpad: ImageVector? = null
