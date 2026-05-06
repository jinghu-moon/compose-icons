package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TemperatureSnow: ImageVector
    get() {
        if (_temperatureSnow != null) return _temperatureSnow!!
        _temperatureSnow = tablerOutlineIcon(
            name = "TemperatureSnow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 13.5c-1.568 .905-2.332 2.751-1.864 4.499 .469 1.749 2.053 2.965 3.864 2.965 1.81 0 3.395-1.216 3.864-2.965C10.332 16.251 9.568 14.405 8 13.5v-8.5C8 3.895 7.105 3 6 3 4.895 3 4 3.895 4 5v8.5")
            addPathData("M4 9h4")
            addPathData("M14.75 4l1 2h2.25")
            addPathData("M17 4 14 9l2 3")
            addPathData("M20.25 10 19 12l1.25 2")
            addPathData("M22 12h-6l-2 3")
            addPathData("M18 18h-2.25l-1 2")
            addPathData("M17 20 14 15h-1")
            addPathData("M12 9l2.088 .008")
        }
        return _temperatureSnow!!
    }

private var _temperatureSnow: ImageVector? = null
