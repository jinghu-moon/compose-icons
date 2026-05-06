package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrowserMaximize: ImageVector
    get() {
        if (_browserMaximize != null) return _browserMaximize!!
        _browserMaximize = tablerOutlineIcon(
            name = "BrowserMaximize",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 8h8")
            addPathData("M20 11.5v6.5c0 1.105-.895 2-2 2h-12C4.895 20 4 19.105 4 18v-12C4 4.895 4.895 4 6 4h6.5")
            addPathData("M8 4v4")
            addPathData("M16 8 21 3")
            addPathData("M21 7.5v-4.5h-4.5")
        }
        return _browserMaximize!!
    }

private var _browserMaximize: ImageVector? = null
