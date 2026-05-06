package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TemperatureFahrenheit: ImageVector
    get() {
        if (_temperatureFahrenheit != null) return _temperatureFahrenheit!!
        _temperatureFahrenheit = tablerOutlineIcon(
            name = "TemperatureFahrenheit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 8c0 1.105 .895 2 2 2C7.105 10 8 9.105 8 8 8 6.895 7.105 6 6 6 4.895 6 4 6.895 4 8")
            addPathData("M13 12h5")
            addPathData("M20 6h-6c-.552 0-1 .448-1 1v11")
        }
        return _temperatureFahrenheit!!
    }

private var _temperatureFahrenheit: ImageVector? = null
