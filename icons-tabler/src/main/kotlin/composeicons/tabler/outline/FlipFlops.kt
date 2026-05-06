package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FlipFlops: ImageVector
    get() {
        if (_flipFlops != null) return _flipFlops!!
        _flipFlops = tablerOutlineIcon(
            name = "FlipFlops",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 4c2.21 0 4 1.682 4 3.758 0 .078 0 .156-.008 .234l-.6 9.014c-.11 1.683-1.596 3-3.392 3-1.796 0-3.28-1.311-3.392-3L14.008 7.992C13.87 5.921 15.546 4.137 17.751 4.007c.083-.005 .167-.007 .25-.007h-.001")
            addPathData("M14.5 14c1-3.333 2.167-5 3.5-5 1.333 0 2.5 1.667 3.5 5")
            addPathData("M18 16v1")
            addPathData("M6 4c2.21 0 4 1.682 4 3.758 0 .078 0 .156-.008 .234l-.6 9.014c-.11 1.683-1.596 3-3.392 3-1.796 0-3.28-1.311-3.392-3L2.008 7.992C1.87 5.921 3.546 4.137 5.75 4.007 5.834 4.007 5.917 4 6 4")
            addPathData("M2.5 14C3.5 10.667 4.667 9 6 9c1.333 0 2.5 1.667 3.5 5")
            addPathData("M6 16v1")
        }
        return _flipFlops!!
    }

private var _flipFlops: ImageVector? = null
