package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Grid4X4: ImageVector
    get() {
        if (_grid4X4 != null) return _grid4X4!!
        _grid4X4 = tablerOutlineIcon(
            name = "Grid4X4",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 6h18")
            addPathData("M3 12h18")
            addPathData("M3 18h18")
            addPathData("M6 3v18")
            addPathData("M12 3v18")
            addPathData("M18 3v18")
        }
        return _grid4X4!!
    }

private var _grid4X4: ImageVector? = null
