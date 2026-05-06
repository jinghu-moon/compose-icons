package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ViewportWide: ImageVector
    get() {
        if (_viewportWide != null) return _viewportWide!!
        _viewportWide = tablerOutlineIcon(
            name = "ViewportWide",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12h-7L6 9")
            addPathData("M6 15 3 12")
            addPathData("M14 12h7L18 9")
            addPathData("M18 15l3-3")
            addPathData("M3 6v-1C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v1")
            addPathData("M3 18v1c0 1.105 .895 2 2 2h14c1.105 0 2-.895 2-2v-1")
        }
        return _viewportWide!!
    }

private var _viewportWide: ImageVector? = null
