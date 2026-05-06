package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.XboxB: ImageVector
    get() {
        if (_xboxB != null) return _xboxB!!
        _xboxB = tablerOutlineIcon(
            name = "XboxB",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21c4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12c0 4.971 4.029 9 9 9")
            addPathData("M13 12c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-3v-4")
            addPathData("M13 12h-3")
            addPathData("M13 12c1.105 0 2-.895 2-2C15 8.895 14.105 8 13 8h-3v4")
        }
        return _xboxB!!
    }

private var _xboxB: ImageVector? = null
