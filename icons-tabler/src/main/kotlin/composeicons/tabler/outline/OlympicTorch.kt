package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.OlympicTorch: ImageVector
    get() {
        if (_olympicTorch != null) return _olympicTorch!!
        _olympicTorch = tablerOutlineIcon(
            name = "OlympicTorch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 9h8")
            addPathData("M9 9c1 4.364 1 7.636 1 12h4c0-4.364 0-7.636 1-12")
            addPathData("M11 3c0 2.5-1 2.66-1 4-.029 .539 .172 1.065 .554 1.446 .382 .382 .907 .583 1.446 .554 .541 .039 1.073-.159 1.457-.543C13.841 8.073 14.039 7.541 14 7 14 5.59 13 4 11 3")
        }
        return _olympicTorch!!
    }

private var _olympicTorch: ImageVector? = null
