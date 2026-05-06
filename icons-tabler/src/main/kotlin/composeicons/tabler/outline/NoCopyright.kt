package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NoCopyright: ImageVector
    get() {
        if (_noCopyright != null) return _noCopyright!!
        _noCopyright = tablerOutlineIcon(
            name = "NoCopyright",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M14 9.75C12.789 8.686 10.955 8.762 9.837 9.923c-1.117 1.159-1.117 2.995 0 4.154 1.118 1.161 2.952 1.237 4.163 .173")
            addPathData("M6 6 7.5 7.5")
            addPathData("M16.5 16.5 18 18")
        }
        return _noCopyright!!
    }

private var _noCopyright: ImageVector? = null
