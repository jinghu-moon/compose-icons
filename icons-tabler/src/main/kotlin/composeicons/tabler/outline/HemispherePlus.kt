package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HemispherePlus: ImageVector
    get() {
        if (_hemispherePlus != null) return _hemispherePlus!!
        _hemispherePlus = tablerOutlineIcon(
            name = "HemispherePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 9c0 1.657 4.029 3 9 3 4.971 0 9-1.343 9-3C21 7.343 16.971 6 12 6 7.029 6 3 7.343 3 9")
            addPathData("M3 9c0 4.971 4.029 9 9 9M20.396 12.248C20.797 11.212 21.001 10.111 21 9")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _hemispherePlus!!
    }

private var _hemispherePlus: ImageVector? = null
