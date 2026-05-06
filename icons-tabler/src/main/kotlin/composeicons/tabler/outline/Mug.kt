package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Mug: ImageVector
    get() {
        if (_mug != null) return _mug!!
        _mug = tablerOutlineIcon(
            name = "Mug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.083 5h10.834c.286-.001 .561 .112 .765 .314 .203 .202 .318 .476 .318 .763v8.615C16 17.072 14.06 19 11.667 19h-4.334C4.94 19 3 17.071 3 14.692v-8.615c.001-.286 .115-.561 .318-.763C3.522 5.112 3.797 4.999 4.083 5")
            addPathData("M16 8h2.5C19.88 8 21 9.045 21 10.333v2.334C21 13.955 19.88 15 18.5 15h-2.5")
        }
        return _mug!!
    }

private var _mug: ImageVector? = null
