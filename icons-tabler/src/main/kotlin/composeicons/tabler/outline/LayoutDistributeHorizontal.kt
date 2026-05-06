package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LayoutDistributeHorizontal: ImageVector
    get() {
        if (_layoutDistributeHorizontal != null) return _layoutDistributeHorizontal!!
        _layoutDistributeHorizontal = tablerOutlineIcon(
            name = "LayoutDistributeHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 4h16")
            addPathData("M4 20h16")
            addPathData("M6 11C6 9.895 6.895 9 8 9h8c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-8C6.895 15 6 14.105 6 13v-2")
        }
        return _layoutDistributeHorizontal!!
    }

private var _layoutDistributeHorizontal: ImageVector? = null
