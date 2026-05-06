package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LayoutAlignRight: ImageVector
    get() {
        if (_layoutAlignRight != null) return _layoutAlignRight!!
        _layoutAlignRight = tablerOutlineIcon(
            name = "LayoutAlignRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 4v16")
            addPathData("M4 11C4 9.895 4.895 9 6 9h8c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-8C4.895 15 4 14.105 4 13v-2")
        }
        return _layoutAlignRight!!
    }

private var _layoutAlignRight: ImageVector? = null
