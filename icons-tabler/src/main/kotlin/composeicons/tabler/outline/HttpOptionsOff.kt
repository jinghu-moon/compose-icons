package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HttpOptionsOff: ImageVector
    get() {
        if (_httpOptionsOff != null) return _httpOptionsOff!!
        _httpOptionsOff = tablerOutlineIcon(
            name = "HttpOptionsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 8c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2C3.895 16 3 15.105 3 14v-4C3 8.895 3.895 8 5 8")
            addPathData("M10 12h2M14 10C14 8.895 13.105 8 12 8M10 10v6")
            addPathData("M17 8h4")
            addPathData("M19 8v7")
            addPathData("M3 3 21 21")
        }
        return _httpOptionsOff!!
    }

private var _httpOptionsOff: ImageVector? = null
