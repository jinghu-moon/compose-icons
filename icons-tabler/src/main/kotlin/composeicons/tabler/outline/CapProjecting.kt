package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CapProjecting: ImageVector
    get() {
        if (_capProjecting != null) return _capProjecting!!
        _capProjecting = tablerOutlineIcon(
            name = "CapProjecting",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 6h-13C5.895 6 5 6.895 5 8v8c0 1.105 .895 2 2 2h13")
            addPathData("M13 12c0 1.105-.895 2-2 2C9.895 14 9 13.105 9 12c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2")
            addPathData("M13 12h7")
        }
        return _capProjecting!!
    }

private var _capProjecting: ImageVector? = null
