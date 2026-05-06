package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BookDownload: ImageVector
    get() {
        if (_bookDownload != null) return _bookDownload!!
        _bookDownload = tablerOutlineIcon(
            name = "BookDownload",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 20h-6C4.895 20 4 19.105 4 18v-12C4 4.895 4.895 4 6 4h12v5")
            addPathData("M13 16h-7c-1.105 0-2 .895-2 2")
            addPathData("M15 19l3 3 3-3")
            addPathData("M18 22v-9")
        }
        return _bookDownload!!
    }

private var _bookDownload: ImageVector? = null
