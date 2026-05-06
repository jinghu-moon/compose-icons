package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BellDown: ImageVector
    get() {
        if (_bellDown != null) return _bellDown!!
        _bellDown = tablerOutlineIcon(
            name = "BellDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.5 17h-8.5c1.105-.626 1.847-1.739 2-3v-3C6.121 8.414 7.66 6.107 10 5c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 2.34 1.107 3.879 3.414 4 6v1")
            addPathData("M9 17v1c-0 .886 .392 1.727 1.07 2.297 .679 .57 1.575 .811 2.448 .658")
            addPathData("M19 16v6")
            addPathData("M22 19l-3 3L16 19")
        }
        return _bellDown!!
    }

private var _bellDown: ImageVector? = null
