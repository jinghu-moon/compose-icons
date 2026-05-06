package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Coins: ImageVector
    get() {
        if (_coins != null) return _coins!!
        _coins = tablerOutlineIcon(
            name = "Coins",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 14c0 1.657 2.686 3 6 3 3.314 0 6-1.343 6-3 0-1.657-2.686-3-6-3-3.314 0-6 1.343-6 3")
            addPathData("M9 14v4c0 1.656 2.686 3 6 3 3.314 0 6-1.344 6-3v-4")
            addPathData("M3 6C3 7.072 4.144 8.062 6 8.598c1.856 .536 4.144 .536 6 0C13.856 8.062 15 7.072 15 6 15 4.928 13.856 3.938 12 3.402c-1.856-.536-4.144-.536-6 0C4.144 3.938 3 4.928 3 6")
            addPathData("M3 6v10c0 .888 .772 1.45 2 2")
            addPathData("M3 11c0 .888 .772 1.45 2 2")
        }
        return _coins!!
    }

private var _coins: ImageVector? = null
