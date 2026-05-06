package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TransferIn: ImageVector
    get() {
        if (_transferIn != null) return _transferIn!!
        _transferIn = tablerOutlineIcon(
            name = "TransferIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 18v3h16v-14L12 3 4 7v3")
            addPathData("M4 14h9")
            addPathData("M10 11l3 3-3 3")
        }
        return _transferIn!!
    }

private var _transferIn: ImageVector? = null
