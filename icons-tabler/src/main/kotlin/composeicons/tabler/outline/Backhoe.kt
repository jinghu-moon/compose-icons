package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Backhoe: ImageVector
    get() {
        if (_backhoe != null) return _backhoe!!
        _backhoe = tablerOutlineIcon(
            name = "Backhoe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C6 15.895 5.105 15 4 15c-1.105 0-2 .895-2 2")
            addPathData("M11 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M13 19h-9")
            addPathData("M4 15h9")
            addPathData("M8 12v-5h2c1.657 0 3 1.343 3 3v5")
            addPathData("M5 15v-2c0-.552 .448-1 1-1h7")
            addPathData("M21.12 9.88 18 5l-5 5")
            addPathData("M21.12 9.88c.857 .858 1.113 2.147 .649 3.268C21.305 14.268 20.213 14.999 19 15c-.795-.001-1.558-.317-2.12-.88L21.12 9.88")
        }
        return _backhoe!!
    }

private var _backhoe: ImageVector? = null
