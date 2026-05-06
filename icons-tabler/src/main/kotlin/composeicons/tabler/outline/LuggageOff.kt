package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LuggageOff: ImageVector
    get() {
        if (_luggageOff != null) return _luggageOff!!
        _luggageOff = tablerOutlineIcon(
            name = "LuggageOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 6h6c1.105 0 2 .895 2 2v6M18 18c0 1.105-.895 2-2 2h-8C6.895 20 6 19.105 6 18v-10C6 7.454 6.218 6.96 6.573 6.6")
            addPathData("M9 5C9 3.895 9.895 3 11 3h2c1.105 0 2 .895 2 2v1")
            addPathData("M6 10h4M14 10h4")
            addPathData("M6 16h10")
            addPathData("M9 20v1")
            addPathData("M15 20v1")
            addPathData("M3 3 21 21")
        }
        return _luggageOff!!
    }

private var _luggageOff: ImageVector? = null
