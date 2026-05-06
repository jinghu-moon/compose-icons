package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Spray: ImageVector
    get() {
        if (_spray != null) return _spray!!
        _spray = tablerOutlineIcon(
            name = "Spray",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12c0-1.105 .895-2 2-2h4c1.105 0 2 .895 2 2v7c0 1.105-.895 2-2 2h-4C4.895 21 4 20.105 4 19v-7")
            addPathData("M6 10v-4C6 5.448 6.448 5 7 5h2c.552 0 1 .448 1 1v4")
            addPathData("M15 7h.01")
            addPathData("M18 9h.01")
            addPathData("M18 5h.01")
            addPathData("M21 3h.01")
            addPathData("M21 7h.01")
            addPathData("M21 11h.01")
            addPathData("M10 7h1")
        }
        return _spray!!
    }

private var _spray: ImageVector? = null
