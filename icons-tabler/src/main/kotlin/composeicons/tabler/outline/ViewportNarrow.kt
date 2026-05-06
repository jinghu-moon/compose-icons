package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ViewportNarrow: ImageVector
    get() {
        if (_viewportNarrow != null) return _viewportNarrow!!
        _viewportNarrow = tablerOutlineIcon(
            name = "ViewportNarrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12h7L7 9")
            addPathData("M7 15l3-3")
            addPathData("M21 12h-7L17 9")
            addPathData("M17 15 14 12")
            addPathData("M9 6v-1C9 3.895 9.895 3 11 3h2c1.105 0 2 .895 2 2v1")
            addPathData("M9 18v1c0 1.105 .895 2 2 2h2c1.105 0 2-.895 2-2v-1")
        }
        return _viewportNarrow!!
    }

private var _viewportNarrow: ImageVector? = null
