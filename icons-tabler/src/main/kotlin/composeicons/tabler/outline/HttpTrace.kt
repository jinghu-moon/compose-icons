package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HttpTrace: ImageVector
    get() {
        if (_httpTrace != null) return _httpTrace!!
        _httpTrace = tablerOutlineIcon(
            name = "HttpTrace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 8h4")
            addPathData("M5 8v8")
            addPathData("M10 12h2c1.105 0 2-.895 2-2C14 8.895 13.105 8 12 8h-2v8")
            addPathData("M14 16 11 12")
            addPathData("M17 16v-6c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v6")
            addPathData("M17 13h4")
        }
        return _httpTrace!!
    }

private var _httpTrace: ImageVector? = null
