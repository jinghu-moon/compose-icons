package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Tir: ImageVector
    get() {
        if (_tir != null) return _tir!!
        _tir = tablerOutlineIcon(
            name = "Tir",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C7 15.895 6.105 15 5 15c-1.105 0-2 .895-2 2")
            addPathData("M15 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M7 18h8M19 18h2v-6C21 8.134 18.761 5 16 5h-1l1.5 7h4.5")
            addPathData("M12 18v-13h3")
            addPathData("M3 17v-5h9")
        }
        return _tir!!
    }

private var _tir: ImageVector? = null
