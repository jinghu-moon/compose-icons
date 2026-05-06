package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlanetOff: ImageVector
    get() {
        if (_planetOff != null) return _planetOff!!
        _planetOff = tablerOutlineIcon(
            name = "PlanetOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7.042 7.059c-2.685 2.744-2.659 7.138 .058 9.85 2.717 2.712 7.111 2.73 9.85 .04M18.531 14.524c1.001-2.585 .381-5.517-1.579-7.477C14.991 5.087 12.059 4.468 9.474 5.47")
            addPathData("M3 3 21 21")
        }
        return _planetOff!!
    }

private var _planetOff: ImageVector? = null
