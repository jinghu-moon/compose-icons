package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HttpPut: ImageVector
    get() {
        if (_httpPut != null) return _httpPut!!
        _httpPut = tablerOutlineIcon(
            name = "HttpPut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12h2c1.105 0 2-.895 2-2C7 8.895 6.105 8 5 8h-2v8")
            addPathData("M17 8h4")
            addPathData("M19 8v8")
            addPathData("M10 8v6c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-6")
        }
        return _httpPut!!
    }

private var _httpPut: ImageVector? = null
