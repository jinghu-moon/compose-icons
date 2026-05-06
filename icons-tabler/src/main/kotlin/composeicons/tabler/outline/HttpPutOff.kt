package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HttpPutOff: ImageVector
    get() {
        if (_httpPutOff != null) return _httpPutOff!!
        _httpPutOff = tablerOutlineIcon(
            name = "HttpPutOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12h2c1.105 0 2-.895 2-2C7 8.895 6.105 8 5 8h-2v8")
            addPathData("M17 8h4")
            addPathData("M19 8v8")
            addPathData("M10 10v4c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2M14 10v-2")
            addPathData("M3 3 21 21")
        }
        return _httpPutOff!!
    }

private var _httpPutOff: ImageVector? = null
