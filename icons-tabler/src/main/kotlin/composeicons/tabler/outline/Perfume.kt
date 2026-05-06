package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Perfume: ImageVector
    get() {
        if (_perfume != null) return _perfume!!
        _perfume = tablerOutlineIcon(
            name = "Perfume",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 6v3")
            addPathData("M14 6v3")
            addPathData("M5 11C5 9.895 5.895 9 7 9h10c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-10C5.895 21 5 20.105 5 19v-8")
            addPathData("M10 15c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M9 3h6v3h-6v-3")
        }
        return _perfume!!
    }

private var _perfume: ImageVector? = null
