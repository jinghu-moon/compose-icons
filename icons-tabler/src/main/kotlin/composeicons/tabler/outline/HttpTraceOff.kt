package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HttpTraceOff: ImageVector
    get() {
        if (_httpTraceOff != null) return _httpTraceOff!!
        _httpTraceOff = tablerOutlineIcon(
            name = "HttpTraceOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 8h4")
            addPathData("M5 8v8")
            addPathData("M10 12h2M14 10C14 8.895 13.105 8 12 8M10 10v6")
            addPathData("M14 16 11 12")
            addPathData("M17 13v-3c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v6")
            addPathData("M17 13h4")
            addPathData("M3 3 21 21")
        }
        return _httpTraceOff!!
    }

private var _httpTraceOff: ImageVector? = null
