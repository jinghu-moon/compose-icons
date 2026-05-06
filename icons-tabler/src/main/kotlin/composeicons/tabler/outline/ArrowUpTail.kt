package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowUpTail: ImageVector
    get() {
        if (_arrowUpTail != null) return _arrowUpTail!!
        _arrowUpTail = tablerOutlineIcon(
            name = "ArrowUpTail",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 18v-15")
            addPathData("M15 6 12 3 9 6")
            addPathData("M15 21 12 18 9 21")
        }
        return _arrowUpTail!!
    }

private var _arrowUpTail: ImageVector? = null
