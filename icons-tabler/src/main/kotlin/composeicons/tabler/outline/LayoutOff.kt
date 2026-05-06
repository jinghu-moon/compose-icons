package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LayoutOff: ImageVector
    get() {
        if (_layoutOff != null) return _layoutOff!!
        _layoutOff = tablerOutlineIcon(
            name = "LayoutOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4c1.105 0 2 .895 2 2M8.838 8.816C8.575 8.937 8.289 9 8 9h-2C4.895 9 4 8.105 4 7v-1C4 5.451 4.221 4.954 4.58 4.593")
            addPathData("M4 15c0-1.105 .895-2 2-2h2c1.105 0 2 .895 2 2v3c0 1.105-.895 2-2 2h-2C4.895 20 4 19.105 4 18v-3")
            addPathData("M14 10v-4c0-1.105 .895-2 2-2h2c1.105 0 2 .895 2 2v10M19.405 19.423c-.374 .37-.879 .577-1.405 .577h-2c-1.105 0-2-.895-2-2v-4")
            addPathData("M3 3 21 21")
        }
        return _layoutOff!!
    }

private var _layoutOff: ImageVector? = null
