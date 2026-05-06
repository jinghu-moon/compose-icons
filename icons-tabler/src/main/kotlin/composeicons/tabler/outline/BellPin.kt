package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BellPin: ImageVector
    get() {
        if (_bellPin != null) return _bellPin!!
        _bellPin = tablerOutlineIcon(
            name = "BellPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 17h-8c1.105-.626 1.847-1.739 2-3v-3C6.121 8.414 7.66 6.107 10 5c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 2.34 1.107 3.879 3.414 4 6")
            addPathData("M9 17v1c-0 .908 .411 1.767 1.118 2.337 .707 .569 1.634 .788 2.522 .594")
            addPathData("M21.121 20.121c.858-.858 1.115-2.148 .651-3.269C21.307 15.73 20.213 14.999 19 14.999c-1.213 0-2.307 .731-2.772 1.852-.464 1.121-.207 2.412 .651 3.269 .418 .419 1.125 1.045 2.121 1.879 1.051-.89 1.759-1.516 2.121-1.879")
            addPathData("M19 18v.01")
        }
        return _bellPin!!
    }

private var _bellPin: ImageVector? = null
