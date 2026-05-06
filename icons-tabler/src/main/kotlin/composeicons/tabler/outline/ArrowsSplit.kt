package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsSplit: ImageVector
    get() {
        if (_arrowsSplit != null) return _arrowsSplit!!
        _arrowsSplit = tablerOutlineIcon(
            name = "ArrowsSplit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 17h-8L9.5 12h-6.5")
            addPathData("M21 7h-8L9.505 12")
            addPathData("M18 10 21 7 18 4")
            addPathData("M18 20l3-3L18 14")
        }
        return _arrowsSplit!!
    }

private var _arrowsSplit: ImageVector? = null
