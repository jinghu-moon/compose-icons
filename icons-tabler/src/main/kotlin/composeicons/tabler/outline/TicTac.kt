package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TicTac: ImageVector
    get() {
        if (_ticTac != null) return _ticTac!!
        _ticTac = tablerOutlineIcon(
            name = "TicTac",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6c0 1.105 .895 2 2 2C7.105 8 8 7.105 8 6 8 4.895 7.105 4 6 4 4.895 4 4 4.895 4 6")
            addPathData("M3 12h18")
            addPathData("M12 3v18")
            addPathData("M4 16l4 4")
            addPathData("M4 20 8 16")
            addPathData("M16 4l4 4")
            addPathData("M16 8 20 4")
            addPathData("M16 18c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
        }
        return _ticTac!!
    }

private var _ticTac: ImageVector? = null
