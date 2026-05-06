package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RainbowOff: ImageVector
    get() {
        if (_rainbowOff != null) return _rainbowOff!!
        _rainbowOff = tablerOutlineIcon(
            name = "RainbowOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 17C22 11.477 17.523 7 12 7c-.308 0-.613 .014-.914 .041M7.878 7.886C4.298 9.506 1.999 13.071 2 17")
            addPathData("M11.088 11.069C8.161 11.519 6 14.038 6 17")
            addPathData("M14 17c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M3 3 21 21")
        }
        return _rainbowOff!!
    }

private var _rainbowOff: ImageVector? = null
