package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrowserShare: ImageVector
    get() {
        if (_browserShare != null) return _browserShare!!
        _browserShare = tablerOutlineIcon(
            name = "BrowserShare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 8h16")
            addPathData("M12.5 20h-6.5C4.895 20 4 19.105 4 18v-12C4 4.895 4.895 4 6 4h12c1.105 0 2 .895 2 2v7")
            addPathData("M8 4v4")
            addPathData("M16 22l5-5")
            addPathData("M21 21.5v-4.5h-4.5")
        }
        return _browserShare!!
    }

private var _browserShare: ImageVector? = null
