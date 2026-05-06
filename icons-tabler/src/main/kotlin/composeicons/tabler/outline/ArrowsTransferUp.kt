package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsTransferUp: ImageVector
    get() {
        if (_arrowsTransferUp != null) return _arrowsTransferUp!!
        _arrowsTransferUp = tablerOutlineIcon(
            name = "ArrowsTransferUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 21v-6")
            addPathData("M20 6 17 3 14 6")
            addPathData("M17 3v18")
            addPathData("M10 18 7 21 4 18")
            addPathData("M7 3v2")
            addPathData("M7 9v2")
        }
        return _arrowsTransferUp!!
    }

private var _arrowsTransferUp: ImageVector? = null
