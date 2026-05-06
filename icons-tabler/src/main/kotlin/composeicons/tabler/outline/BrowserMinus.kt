package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrowserMinus: ImageVector
    get() {
        if (_browserMinus != null) return _browserMinus!!
        _browserMinus = tablerOutlineIcon(
            name = "BrowserMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 8h16")
            addPathData("M12 20h-6C4.895 20 4 19.105 4 18v-12C4 4.895 4.895 4 6 4h12c1.105 0 2 .895 2 2v9")
            addPathData("M8 4v4")
            addPathData("M16 19h6")
        }
        return _browserMinus!!
    }

private var _browserMinus: ImageVector? = null
