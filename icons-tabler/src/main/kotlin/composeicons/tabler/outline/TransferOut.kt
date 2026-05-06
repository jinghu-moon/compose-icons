package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TransferOut: ImageVector
    get() {
        if (_transferOut != null) return _transferOut!!
        _transferOut = tablerOutlineIcon(
            name = "TransferOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 19v2h16v-14L12 3 4 7v2")
            addPathData("M13 14h-9")
            addPathData("M7 11 4 14l3 3")
        }
        return _transferOut!!
    }

private var _transferOut: ImageVector? = null
