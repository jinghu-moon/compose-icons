package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Copyleft: ImageVector
    get() {
        if (_copyleft != null) return _copyleft!!
        _copyleft = tablerOutlineIcon(
            name = "Copyleft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M10 9.75c1.211-1.064 3.045-.988 4.163 .173 1.117 1.159 1.117 2.995 0 4.154-1.118 1.161-2.952 1.237-4.163 .173")
        }
        return _copyleft!!
    }

private var _copyleft: ImageVector? = null
