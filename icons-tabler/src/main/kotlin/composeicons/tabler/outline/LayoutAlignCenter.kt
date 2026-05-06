package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LayoutAlignCenter: ImageVector
    get() {
        if (_layoutAlignCenter != null) return _layoutAlignCenter!!
        _layoutAlignCenter = tablerOutlineIcon(
            name = "LayoutAlignCenter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 4v5")
            addPathData("M12 15v5")
            addPathData("M6 11C6 9.895 6.895 9 8 9h8c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-8C6.895 15 6 14.105 6 13v-2")
        }
        return _layoutAlignCenter!!
    }

private var _layoutAlignCenter: ImageVector? = null
