package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsRandom: ImageVector
    get() {
        if (_arrowsRandom != null) return _arrowsRandom!!
        _arrowsRandom = tablerOutlineIcon(
            name = "ArrowsRandom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 21h-4v-4")
            addPathData("M16 21l5-5")
            addPathData("M6.5 9.504 3 7.504 5 4")
            addPathData("M3 7.504 9.83 5.634")
            addPathData("M4 16 8 15l1 4")
            addPathData("M8 15 4.5 21")
            addPathData("M21 5l-.5 4-4-.5")
            addPathData("M20.5 9 16 3.5")
        }
        return _arrowsRandom!!
    }

private var _arrowsRandom: ImageVector? = null
