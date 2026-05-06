package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Thermometer: ImageVector
    get() {
        if (_thermometer != null) return _thermometer!!
        _thermometer = tablerOutlineIcon(
            name = "Thermometer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 5c.531 .53 .829 1.25 .829 2 0 .75-.298 1.47-.829 2l-8 8h-4v-4L15 5c.53-.531 1.25-.829 2-.829 .75 0 1.47 .298 2 .829")
            addPathData("M16 7 14.5 5.5")
            addPathData("M13 10 11.5 8.5")
            addPathData("M10 13 8.5 11.5")
            addPathData("M7 17 4 20")
        }
        return _thermometer!!
    }

private var _thermometer: ImageVector? = null
