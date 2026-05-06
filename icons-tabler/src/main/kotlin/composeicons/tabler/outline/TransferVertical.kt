package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TransferVertical: ImageVector
    get() {
        if (_transferVertical != null) return _transferVertical!!
        _transferVertical = tablerOutlineIcon(
            name = "TransferVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 4v16L4 14.5")
            addPathData("M14 20v-16l6 5.5")
        }
        return _transferVertical!!
    }

private var _transferVertical: ImageVector? = null
