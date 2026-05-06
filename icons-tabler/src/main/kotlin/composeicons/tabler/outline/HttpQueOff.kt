package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HttpQueOff: ImageVector
    get() {
        if (_httpQueOff != null) return _httpQueOff!!
        _httpQueOff = tablerOutlineIcon(
            name = "HttpQueOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 8c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2C3.895 16 3 15.105 3 14v-4C3 8.895 3.895 8 5 8")
            addPathData("M6 15l1 1")
            addPathData("M21 8h-4v8h4")
            addPathData("M17 12h2.5")
            addPathData("M10 10v4c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2M14 10v-2")
            addPathData("M3 3 21 21")
        }
        return _httpQueOff!!
    }

private var _httpQueOff: ImageVector? = null
