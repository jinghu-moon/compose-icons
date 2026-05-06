package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LayoutAlignMiddle: ImageVector
    get() {
        if (_layoutAlignMiddle != null) return _layoutAlignMiddle!!
        _layoutAlignMiddle = tablerOutlineIcon(
            name = "LayoutAlignMiddle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12h5")
            addPathData("M15 12h5")
            addPathData("M9 8C9 6.895 9.895 6 11 6h2c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-2C9.895 18 9 17.105 9 16v-8")
        }
        return _layoutAlignMiddle!!
    }

private var _layoutAlignMiddle: ImageVector? = null
