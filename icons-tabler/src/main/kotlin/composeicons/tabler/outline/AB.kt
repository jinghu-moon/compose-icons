package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AB: ImageVector
    get() {
        if (_aB != null) return _aB!!
        _aB = tablerOutlineIcon(
            name = "AB",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 16v-5.5C3 9.119 4.119 8 5.5 8 6.881 8 8 9.119 8 10.5v5.5M8 12h-5")
            addPathData("M12 6v12")
            addPathData("M16 16v-8h3c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-3M19 12c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-3")
        }
        return _aB!!
    }

private var _aB: ImageVector? = null
