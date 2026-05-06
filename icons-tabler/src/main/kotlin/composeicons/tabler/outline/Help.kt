package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Help: ImageVector
    get() {
        if (_help != null) return _help!!
        _help = tablerOutlineIcon(
            name = "Help",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M12 17v.01")
            addPathData("M12 13.5c-.038-.667 .37-1.278 1-1.5 1.031-.394 1.7-1.396 1.67-2.499C14.64 8.398 13.917 7.434 12.867 7.096 11.816 6.759 10.667 7.121 10 8")
        }
        return _help!!
    }

private var _help: ImageVector? = null
