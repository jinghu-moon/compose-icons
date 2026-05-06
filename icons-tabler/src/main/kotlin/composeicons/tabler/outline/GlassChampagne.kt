package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GlassChampagne: ImageVector
    get() {
        if (_glassChampagne != null) return _glassChampagne!!
        _glassChampagne = tablerOutlineIcon(
            name = "GlassChampagne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 21h6")
            addPathData("M12 16v5")
            addPathData("M8 5c0 1.105 1.791 2 4 2 2.209 0 4-.895 4-2C16 3.895 14.209 3 12 3 9.791 3 8 3.895 8 5")
            addPathData("M8 5c0 6.075 1.79 11 4 11 2.21 0 4-4.925 4-11")
        }
        return _glassChampagne!!
    }

private var _glassChampagne: ImageVector? = null
