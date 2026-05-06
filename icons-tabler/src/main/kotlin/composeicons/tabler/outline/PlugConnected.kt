package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlugConnected: ImageVector
    get() {
        if (_plugConnected != null) return _plugConnected!!
        _plugConnected = tablerOutlineIcon(
            name = "PlugConnected",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 12l5 5-1.5 1.5c-.888 .917-2.202 1.285-3.437 .961C5.827 19.137 4.863 18.173 4.539 16.937c-.324-1.235 .044-2.549 .961-3.437L7 12")
            addPathData("M17 12 12 7 13.5 5.5c.888-.917 2.202-1.285 3.437-.961 1.235 .324 2.2 1.288 2.524 2.524 .324 1.235-.044 2.549-.961 3.437L17 12")
            addPathData("M3 21 5.5 18.5")
            addPathData("M18.5 5.5 21 3")
            addPathData("M10 11 8 13")
            addPathData("M13 14l-2 2")
        }
        return _plugConnected!!
    }

private var _plugConnected: ImageVector? = null
