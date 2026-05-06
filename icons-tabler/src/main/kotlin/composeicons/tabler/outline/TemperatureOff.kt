package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TemperatureOff: ImageVector
    get() {
        if (_temperatureOff != null) return _temperatureOff!!
        _temperatureOff = tablerOutlineIcon(
            name = "TemperatureOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 10v3.5C8.193 14.544 7.491 16.802 8.39 18.686c.898 1.884 3.094 2.761 5.043 2.013 1.949-.747 2.995-2.867 2.404-4.869M14 10v-5C14 3.895 13.105 3 12 3c-1.105 0-2 .895-2 2v1")
            addPathData("M13 9h1")
            addPathData("M3 3 21 21")
        }
        return _temperatureOff!!
    }

private var _temperatureOff: ImageVector? = null
