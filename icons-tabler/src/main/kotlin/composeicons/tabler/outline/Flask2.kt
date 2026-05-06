package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Flask2: ImageVector
    get() {
        if (_flask2 != null) return _flask2!!
        _flask2 = tablerOutlineIcon(
            name = "Flask2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.1 15h11.8")
            addPathData("M14 3v7.342c2.145 .758 3.677 2.663 3.957 4.921 .279 2.258-.743 4.479-2.639 5.737h-6.635C6.786 19.743 5.763 17.521 6.042 15.262 6.321 13.004 7.854 11.097 10 10.34v-7.34h4")
            addPathData("M9 3h6")
        }
        return _flask2!!
    }

private var _flask2: ImageVector? = null
