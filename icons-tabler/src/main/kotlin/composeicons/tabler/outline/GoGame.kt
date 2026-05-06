package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GoGame: ImageVector
    get() {
        if (_goGame != null) return _goGame!!
        _goGame = tablerOutlineIcon(
            name = "GoGame",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6c0 1.105 .895 2 2 2C7.105 8 8 7.105 8 6 8 4.895 7.105 4 6 4 4.895 4 4 4.895 4 6")
            addPathData("M10 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M4 18c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C8 16.895 7.105 16 6 16c-1.105 0-2 .895-2 2")
            addPathData("M16 18c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M3 12h7M14 12h7")
            addPathData("M3 6h1M8 6h13")
            addPathData("M3 18h1M8 18h8M20 18h1")
            addPathData("M6 3v1M6 8v8M6 20v1")
            addPathData("M12 3v7M12 14v7")
            addPathData("M18 3v13M18 20v1")
        }
        return _goGame!!
    }

private var _goGame: ImageVector? = null
