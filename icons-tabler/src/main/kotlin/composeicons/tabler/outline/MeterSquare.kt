package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MeterSquare: ImageVector
    get() {
        if (_meterSquare != null) return _meterSquare!!
        _meterSquare = tablerOutlineIcon(
            name = "MeterSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 5h2c.552 0 1 .448 1 1v1c0 .552-.448 1-1 1h-1c-.552 0-1 .448-1 1v1c0 .552 .448 1 1 1h2")
            addPathData("M4 12v6")
            addPathData("M4 14c0-1.105 .895-2 2-2h.5C7.881 12 9 13.119 9 14.5v3.5")
            addPathData("M9 15.5v-1C9 13.119 10.119 12 11.5 12 12.881 12 14 13.119 14 14.5v3.5")
        }
        return _meterSquare!!
    }

private var _meterSquare: ImageVector? = null
