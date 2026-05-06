package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ViewportTall: ImageVector
    get() {
        if (_viewportTall != null) return _viewportTall!!
        _viewportTall = tablerOutlineIcon(
            name = "ViewportTall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 10v-7l3 3")
            addPathData("M9 6 12 3")
            addPathData("M12 14v7l3-3")
            addPathData("M9 18l3 3")
            addPathData("M18 3h1c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-1")
            addPathData("M6 3h-1C3.895 3 3 3.895 3 5v14c0 1.105 .895 2 2 2h1")
        }
        return _viewportTall!!
    }

private var _viewportTall: ImageVector? = null
