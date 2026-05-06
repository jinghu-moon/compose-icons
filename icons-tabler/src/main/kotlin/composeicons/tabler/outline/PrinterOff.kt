package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PrinterOff: ImageVector
    get() {
        if (_printerOff != null) return _printerOff!!
        _printerOff = tablerOutlineIcon(
            name = "PrinterOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.412 16.416C20.775 16.054 21 15.553 21 15v-4C21 9.895 20.105 9 19 9h-6M9 9h-4C3.895 9 3 9.895 3 11v4c0 1.105 .895 2 2 2h2")
            addPathData("M17 9v-4C17 3.895 16.105 3 15 3h-6C8.449 3 7.95 3.223 7.588 3.584M7 7v2")
            addPathData("M17 17v2c0 1.105-.895 2-2 2h-6C7.895 21 7 20.105 7 19v-4c0-1.105 .895-2 2-2h4")
            addPathData("M3 3 21 21")
        }
        return _printerOff!!
    }

private var _printerOff: ImageVector? = null
