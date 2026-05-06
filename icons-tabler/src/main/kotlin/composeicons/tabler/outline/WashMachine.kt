package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WashMachine: ImageVector
    get() {
        if (_washMachine != null) return _washMachine!!
        _washMachine = tablerOutlineIcon(
            name = "WashMachine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 5C5 3.895 5.895 3 7 3h10c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-10C5.895 21 5 20.105 5 19v-14")
            addPathData("M8 14c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4C9.791 10 8 11.791 8 14")
            addPathData("M8 6h.01")
            addPathData("M11 6h.01")
            addPathData("M14 6h2")
            addPathData("M8 14c1.333-.667 2.667-.667 4 0 1.333 .667 2.667 .667 4 0")
        }
        return _washMachine!!
    }

private var _washMachine: ImageVector? = null
