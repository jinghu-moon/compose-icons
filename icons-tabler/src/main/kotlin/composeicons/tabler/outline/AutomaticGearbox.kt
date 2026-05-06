package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AutomaticGearbox: ImageVector
    get() {
        if (_automaticGearbox != null) return _automaticGearbox!!
        _automaticGearbox = tablerOutlineIcon(
            name = "AutomaticGearbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 17v4h1c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2h-1")
            addPathData("M17 11h1.5C19.328 11 20 10.328 20 9.5 20 8.672 19.328 8 18.5 8h-1.5v5")
            addPathData("M3 5c0 1.105 .895 2 2 2C6.105 7 7 6.105 7 5 7 3.895 6.105 3 5 3 3.895 3 3 3.895 3 5")
            addPathData("M5 7v3c0 .552 .448 1 1 1h3v7c0 .552 .448 1 1 1h3")
            addPathData("M9 11h4")
        }
        return _automaticGearbox!!
    }

private var _automaticGearbox: ImageVector? = null
