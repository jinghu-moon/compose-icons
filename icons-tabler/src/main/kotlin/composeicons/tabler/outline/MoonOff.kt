package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoonOff: ImageVector
    get() {
        if (_moonOff != null) return _moonOff!!
        _moonOff = tablerOutlineIcon(
            name = "MoonOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7.962 3.949C9.215 3.319 10.598 2.991 12 2.992v.008h.393c-.971 .9-1.685 2.042-2.07 3.308M10.182 10.148c.186 .823 .514 1.626 .989 2.373 1.045 1.644 2.69 2.817 4.586 3.268M19.65 15.679c.223-.067 .444-.144 .663-.233-.084 .202-.176 .401-.274 .597M18.344 18.38C14.823 21.89 9.124 21.881 5.615 18.361 2.105 14.84 2.113 9.141 5.634 5.631")
            addPathData("M3 3 21 21")
        }
        return _moonOff!!
    }

private var _moonOff: ImageVector? = null
