package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GrillOff: ImageVector
    get() {
        if (_grillOff != null) return _grillOff!!
        _grillOff = tablerOutlineIcon(
            name = "GrillOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 8h-3c0 3.314 2.686 6 6 6h2c.315 0 .624-.024 .926-.071M16.712 12.715c1.384-1.088 2.22-2.73 2.284-4.49v-.225h-7")
            addPathData("M18.827 18.815c-.363 .811-1.217 1.286-2.098 1.165-.88-.121-1.575-.808-1.706-1.687-.131-.879 .334-1.739 1.141-2.111")
            addPathData("M9 14 6 20")
            addPathData("M15 18h-8")
            addPathData("M15 5v-1")
            addPathData("M12 5v-1")
            addPathData("M9 5v-1")
            addPathData("M3 3 21 21")
        }
        return _grillOff!!
    }

private var _grillOff: ImageVector? = null
