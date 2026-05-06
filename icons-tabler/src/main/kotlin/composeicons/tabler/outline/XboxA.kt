package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.XboxA: ImageVector
    get() {
        if (_xboxA != null) return _xboxA!!
        _xboxA = tablerOutlineIcon(
            name = "XboxA",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21c4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12c0 4.971 4.029 9 9 9")
            addPathData("M15 16 12 8 9 16")
            addPathData("M14 14h-4")
        }
        return _xboxA!!
    }

private var _xboxA: ImageVector? = null
