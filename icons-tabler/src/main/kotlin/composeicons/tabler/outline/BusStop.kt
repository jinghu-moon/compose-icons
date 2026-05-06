package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BusStop: ImageVector
    get() {
        if (_busStop != null) return _busStop!!
        _busStop = tablerOutlineIcon(
            name = "BusStop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 4C3 3.448 3.448 3 4 3h2c.552 0 1 .448 1 1v4C7 8.552 6.552 9 6 9h-2C3.448 9 3 8.552 3 8v-4")
            addPathData("M16 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M10 5h7c2.761 0 5 3.134 5 7v5h-2")
            addPathData("M16 17h-8")
            addPathData("M16 5l1.5 7h4.5")
            addPathData("M9.5 10h7.5")
            addPathData("M12 5v5")
            addPathData("M5 9v11")
        }
        return _busStop!!
    }

private var _busStop: ImageVector? = null
