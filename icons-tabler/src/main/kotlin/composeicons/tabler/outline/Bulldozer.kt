package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bulldozer: ImageVector
    get() {
        if (_bulldozer != null) return _bulldozer!!
        _bulldozer = tablerOutlineIcon(
            name = "Bulldozer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C6 15.895 5.105 15 4 15c-1.105 0-2 .895-2 2")
            addPathData("M12 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M19 13v4c0 1.105 .895 2 2 2h1")
            addPathData("M14 19h-10")
            addPathData("M4 15h10")
            addPathData("M9 11v-5h2c1.657 0 3 1.343 3 3v6")
            addPathData("M5 15v-3c0-.552 .448-1 1-1h8")
            addPathData("M19 17h-3")
        }
        return _bulldozer!!
    }

private var _bulldozer: ImageVector? = null
