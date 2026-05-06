package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsTransferUpDown: ImageVector
    get() {
        if (_arrowsTransferUpDown != null) return _arrowsTransferUpDown!!
        _arrowsTransferUpDown = tablerOutlineIcon(
            name = "ArrowsTransferUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 21v-6")
            addPathData("M20 6 17 3 14 6")
            addPathData("M10 18 7 21 4 18")
            addPathData("M7 3v2")
            addPathData("M7 9v2")
            addPathData("M17 3v6")
            addPathData("M17 21v-2")
            addPathData("M17 15v-2")
        }
        return _arrowsTransferUpDown!!
    }

private var _arrowsTransferUpDown: ImageVector? = null
