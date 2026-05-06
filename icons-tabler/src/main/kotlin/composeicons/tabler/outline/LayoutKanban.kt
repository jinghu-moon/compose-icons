package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LayoutKanban: ImageVector
    get() {
        if (_layoutKanban != null) return _layoutKanban!!
        _layoutKanban = tablerOutlineIcon(
            name = "LayoutKanban",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 4h6")
            addPathData("M14 4h6")
            addPathData("M4 10C4 8.895 4.895 8 6 8h2c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-2C4.895 20 4 19.105 4 18v-8")
            addPathData("M14 10c0-1.105 .895-2 2-2h2c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-2c-1.105 0-2-.895-2-2v-2")
        }
        return _layoutKanban!!
    }

private var _layoutKanban: ImageVector? = null
