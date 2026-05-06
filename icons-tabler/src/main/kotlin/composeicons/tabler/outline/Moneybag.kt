package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Moneybag: ImageVector
    get() {
        if (_moneybag != null) return _moneybag!!
        _moneybag = tablerOutlineIcon(
            name = "Moneybag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.5 3h5C15.328 3 16 3.672 16 4.5 16 6.433 14.433 8 12.5 8h-1C9.567 8 8 6.433 8 4.5 8 3.672 8.672 3 9.5 3")
            addPathData("M4 17v-1C4 11.582 7.582 8 12 8c4.418 0 8 3.582 8 8v1c0 2.209-1.791 4-4 4h-8C5.791 21 4 19.209 4 17")
        }
        return _moneybag!!
    }

private var _moneybag: ImageVector? = null
