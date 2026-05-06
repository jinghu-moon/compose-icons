package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HttpPostOff: ImageVector
    get() {
        if (_httpPostOff != null) return _httpPostOff!!
        _httpPostOff = tablerOutlineIcon(
            name = "HttpPostOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12h2c1.105 0 2-.895 2-2C7 8.895 6.105 8 5 8h-2v8")
            addPathData("M12 8c1.105 0 2 .895 2 2M14 14c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2v-4")
            addPathData("M20 16c.552 0 1-.448 1-1v-2c0-.552-.448-1-1-1h-2c-.552 0-1-.448-1-1v-2c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1")
            addPathData("M3 3 21 21")
        }
        return _httpPostOff!!
    }

private var _httpPostOff: ImageVector? = null
