package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TemperatureCelsius: ImageVector
    get() {
        if (_temperatureCelsius != null) return _temperatureCelsius!!
        _temperatureCelsius = tablerOutlineIcon(
            name = "TemperatureCelsius",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 8c0 1.105 .895 2 2 2C7.105 10 8 9.105 8 8 8 6.895 7.105 6 6 6 4.895 6 4 6.895 4 8")
            addPathData("M20 9C20 7.343 18.657 6 17 6h-1C14.343 6 13 7.343 13 9v6c0 1.657 1.343 3 3 3h1c1.657 0 3-1.343 3-3")
        }
        return _temperatureCelsius!!
    }

private var _temperatureCelsius: ImageVector? = null
