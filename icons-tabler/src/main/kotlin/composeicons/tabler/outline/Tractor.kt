package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Tractor: ImageVector
    get() {
        if (_tractor != null) return _tractor!!
        _tractor = tablerOutlineIcon(
            name = "Tractor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 15c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C11 12.791 9.209 11 7 11 4.791 11 3 12.791 3 15")
            addPathData("M7 15v.01")
            addPathData("M17 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M10.5 17h6.5")
            addPathData("M20 15.2v-4.2c0-.552-.448-1-1-1h-6L11 5h-6v6.5")
            addPathData("M18 5h-1c-.552 0-1 .448-1 1v4")
        }
        return _tractor!!
    }

private var _tractor: ImageVector? = null
