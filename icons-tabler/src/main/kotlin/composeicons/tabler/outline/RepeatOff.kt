package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RepeatOff: ImageVector
    get() {
        if (_repeatOff != null) return _repeatOff!!
        _repeatOff = tablerOutlineIcon(
            name = "RepeatOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12v-3C4 7.664 4.873 6.532 6.08 6.144M10 6h10M17 3l3 3L17 9")
            addPathData("M20 12v3c0 .3-.045 .599-.133 .886M17.877 17.87c-.284 .087-.58 .13-.877 .13h-13M7 21 4 18 7 15")
            addPathData("M3 3 21 21")
        }
        return _repeatOff!!
    }

private var _repeatOff: ImageVector? = null
