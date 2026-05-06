package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LayoutAlignLeft: ImageVector
    get() {
        if (_layoutAlignLeft != null) return _layoutAlignLeft!!
        _layoutAlignLeft = tablerOutlineIcon(
            name = "LayoutAlignLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 4v16")
            addPathData("M8 11C8 9.895 8.895 9 10 9h8c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-8C8.895 15 8 14.105 8 13v-2")
        }
        return _layoutAlignLeft!!
    }

private var _layoutAlignLeft: ImageVector? = null
