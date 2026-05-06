package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrightnessAuto: ImageVector
    get() {
        if (_brightnessAuto != null) return _brightnessAuto!!
        _brightnessAuto = tablerOutlineIcon(
            name = "BrightnessAuto",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 6h3.5L12 3.5 14.5 6h3.5v3.5L20.5 12 18 14.5v3.5h-3.5L12 20.5 9.5 18h-3.5v-3.5L3.5 12 6 9.5v-3.5")
            addPathData("M10 14.5v-3.5c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v3.5")
            addPathData("M10 13h4")
        }
        return _brightnessAuto!!
    }

private var _brightnessAuto: ImageVector? = null
