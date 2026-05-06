package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutGrid: ImageVector
    get() {
        if (_layoutGrid != null) return _layoutGrid!!
        _layoutGrid = tablerFilledIcon(
            name = "LayoutGrid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 3c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-4C3.895 11 3 10.105 3 9v-4C3 3.895 3.895 3 5 3Z")
            addPathData("M19 3c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-4c-1.105 0-2-.895-2-2v-4c0-1.105 .895-2 2-2Z")
            addPathData("M9 13c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-4C3.895 21 3 20.105 3 19v-4c0-1.105 .895-2 2-2Z")
            addPathData("M19 13c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-4c-1.105 0-2-.895-2-2v-4c0-1.105 .895-2 2-2Z")
        }
        return _layoutGrid!!
    }

private var _layoutGrid: ImageVector? = null
