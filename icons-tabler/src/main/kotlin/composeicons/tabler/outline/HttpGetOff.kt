package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HttpGetOff: ImageVector
    get() {
        if (_httpGetOff != null) return _httpGetOff!!
        _httpGetOff = tablerOutlineIcon(
            name = "HttpGetOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 8h-2C3.895 8 3 8.895 3 10v4c0 1.105 .895 2 2 2h2v-4h-1")
            addPathData("M14 8h-2M10 10v6h4")
            addPathData("M10 12h2")
            addPathData("M17 8h4")
            addPathData("M19 8v7")
            addPathData("M3 3 21 21")
        }
        return _httpGetOff!!
    }

private var _httpGetOff: ImageVector? = null
