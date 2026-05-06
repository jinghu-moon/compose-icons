package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LayoutAlignBottom: ImageVector
    get() {
        if (_layoutAlignBottom != null) return _layoutAlignBottom!!
        _layoutAlignBottom = tablerOutlineIcon(
            name = "LayoutAlignBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 20h16")
            addPathData("M9 6C9 4.895 9.895 4 11 4h2c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-2C9.895 16 9 15.105 9 14v-8")
        }
        return _layoutAlignBottom!!
    }

private var _layoutAlignBottom: ImageVector? = null
