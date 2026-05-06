package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HttpGet: ImageVector
    get() {
        if (_httpGet != null) return _httpGet!!
        _httpGet = tablerOutlineIcon(
            name = "HttpGet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 8h-2C3.895 8 3 8.895 3 10v4c0 1.105 .895 2 2 2h2v-4h-1")
            addPathData("M14 8h-4v8h4")
            addPathData("M10 12h2.5")
            addPathData("M17 8h4")
            addPathData("M19 8v8")
        }
        return _httpGet!!
    }

private var _httpGet: ImageVector? = null
