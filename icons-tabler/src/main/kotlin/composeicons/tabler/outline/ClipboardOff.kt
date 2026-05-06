package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClipboardOff: ImageVector
    get() {
        if (_clipboardOff != null) return _clipboardOff!!
        _clipboardOff = tablerOutlineIcon(
            name = "ClipboardOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.575 5.597C5.207 5.971 5 6.475 5 7v12c0 1.105 .895 2 2 2h10c1.105 0 2-.895 2-2M19 15v-8C19 5.895 18.105 5 17 5h-2")
            addPathData("M9 5C9 3.895 9.895 3 11 3h2c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-2")
            addPathData("M3 3 21 21")
        }
        return _clipboardOff!!
    }

private var _clipboardOff: ImageVector? = null
