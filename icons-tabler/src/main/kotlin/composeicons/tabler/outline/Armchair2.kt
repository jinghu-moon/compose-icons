package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Armchair2: ImageVector
    get() {
        if (_armchair2 != null) return _armchair2!!
        _armchair2 = tablerOutlineIcon(
            name = "Armchair2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 10v-4C5 4.343 6.343 3 8 3h8c1.657 0 3 1.343 3 3v4")
            addPathData("M16 15v-2c0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3v3h-14v-3C3.343 16 2 14.657 2 13 2 11.343 3.343 10 5 10c1.657 0 3 1.343 3 3v2")
            addPathData("M8 12h8")
            addPathData("M7 19v2")
            addPathData("M17 19v2")
        }
        return _armchair2!!
    }

private var _armchair2: ImageVector? = null
