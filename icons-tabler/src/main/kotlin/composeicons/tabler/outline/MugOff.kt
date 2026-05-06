package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MugOff: ImageVector
    get() {
        if (_mugOff != null) return _mugOff!!
        _mugOff = tablerOutlineIcon(
            name = "MugOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 5h5.917c.286-.001 .561 .112 .765 .314 .203 .202 .318 .476 .318 .763v5.923M15.833 15.88c-.539 1.852-2.237 3.124-4.166 3.12h-4.334C4.94 19 3 17.071 3 14.692v-8.615c.001-.286 .115-.561 .318-.763C3.522 5.112 3.797 4.999 4.083 5h.917")
            addPathData("M16 8h2.5C19.88 8 21 9.045 21 10.333v2.334c0 1.148-.89 2.103-2.06 2.297")
            addPathData("M3 3 21 21")
        }
        return _mugOff!!
    }

private var _mugOff: ImageVector? = null
