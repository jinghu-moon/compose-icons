package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Contract: ImageVector
    get() {
        if (_contract != null) return _contract!!
        _contract = tablerOutlineIcon(
            name = "Contract",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 21h-2C4.343 21 3 19.657 3 18v-1h5.5")
            addPathData("M17 8.5v-3.5c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-2")
            addPathData("M19 3h-11C6.343 3 5 4.343 5 6v11")
            addPathData("M9 7h4")
            addPathData("M9 11h4")
            addPathData("M18.42 12.61c.82-.82 2.15-.82 2.97 0 .82 .82 .82 2.15 0 2.97L15 22h-3v-3l6.42-6.39")
        }
        return _contract!!
    }

private var _contract: ImageVector? = null
