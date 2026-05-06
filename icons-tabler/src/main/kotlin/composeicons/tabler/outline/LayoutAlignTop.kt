package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LayoutAlignTop: ImageVector
    get() {
        if (_layoutAlignTop != null) return _layoutAlignTop!!
        _layoutAlignTop = tablerOutlineIcon(
            name = "LayoutAlignTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 4h16")
            addPathData("M9 10C9 8.895 9.895 8 11 8h2c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-2C9.895 20 9 19.105 9 18v-8")
        }
        return _layoutAlignTop!!
    }

private var _layoutAlignTop: ImageVector? = null
