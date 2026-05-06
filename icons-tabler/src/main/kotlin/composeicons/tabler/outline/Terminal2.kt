package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Terminal2: ImageVector
    get() {
        if (_terminal2 != null) return _terminal2!!
        _terminal2 = tablerOutlineIcon(
            name = "Terminal2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 9l3 3L8 15")
            addPathData("M13 15h3")
            addPathData("M3 6C3 4.895 3.895 4 5 4h14c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-14C3.895 20 3 19.105 3 18v-12")
        }
        return _terminal2!!
    }

private var _terminal2: ImageVector? = null
