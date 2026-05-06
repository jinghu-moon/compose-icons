package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SmartHomeOff: ImageVector
    get() {
        if (_smartHomeOff != null) return _smartHomeOff!!
        _smartHomeOff = tablerOutlineIcon(
            name = "SmartHomeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7.097 7.125 5.06 8.71C4.41 9.215 4.031 9.992 4.031 10.815v7.2c0 1.105 .895 2 2 2h12c.559 0 1.064-.229 1.427-.598M20.03 16v-5.185C20.03 9.992 19.65 9.215 19 8.71L13.667 4.562c-.963-.749-2.311-.749-3.274 0L9.364 5.362")
            addPathData("M15.332 15.345C13.119 16.321 9.997 16.205 8 15")
            addPathData("M3 3 21 21")
        }
        return _smartHomeOff!!
    }

private var _smartHomeOff: ImageVector? = null
