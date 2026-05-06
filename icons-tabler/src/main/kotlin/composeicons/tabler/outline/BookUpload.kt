package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BookUpload: ImageVector
    get() {
        if (_bookUpload != null) return _bookUpload!!
        _bookUpload = tablerOutlineIcon(
            name = "BookUpload",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 20h-8C4.895 20 4 19.105 4 18v-12C4 4.895 4.895 4 6 4h12v5")
            addPathData("M11 16h-5c-1.105 0-2 .895-2 2")
            addPathData("M15 16l3-3 3 3")
            addPathData("M18 13v9")
        }
        return _bookUpload!!
    }

private var _bookUpload: ImageVector? = null
