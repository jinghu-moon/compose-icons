package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HomeSignal: ImageVector
    get() {
        if (_homeSignal != null) return _homeSignal!!
        _homeSignal = tablerOutlineIcon(
            name = "HomeSignal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 22v-2")
            addPathData("M18 22v-4")
            addPathData("M21 22v-6")
            addPathData("M19 12.494v-.494h2L12 3 3 12h2v7c0 1.105 .895 2 2 2h4")
            addPathData("M9 21v-6c0-1.105 .895-2 2-2h2c1.105 0 2 .895 2 2v.5")
        }
        return _homeSignal!!
    }

private var _homeSignal: ImageVector? = null
