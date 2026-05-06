package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Backpack: ImageVector
    get() {
        if (_backpack != null) return _backpack!!
        _backpack = tablerOutlineIcon(
            name = "Backpack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 18v-6C5 8.686 7.686 6 11 6h2c3.314 0 6 2.686 6 6v6c0 1.657-1.343 3-3 3h-8C6.343 21 5 19.657 5 18")
            addPathData("M10 6v-1c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v1")
            addPathData("M9 21v-4c0-1.105 .895-2 2-2h2c1.105 0 2 .895 2 2v4")
            addPathData("M11 10h2")
        }
        return _backpack!!
    }

private var _backpack: ImageVector? = null
