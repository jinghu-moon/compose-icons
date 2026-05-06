package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HourglassLow: ImageVector
    get() {
        if (_hourglassLow != null) return _hourglassLow!!
        _hourglassLow = tablerOutlineIcon(
            name = "HourglassLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.5 17h11")
            addPathData("M6 20v-2c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v2c0 .552-.448 1-1 1h-10C6.448 21 6 20.552 6 20")
            addPathData("M6 4v2c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-2C18 3.448 17.552 3 17 3h-10C6.448 3 6 3.448 6 4")
        }
        return _hourglassLow!!
    }

private var _hourglassLow: ImageVector? = null
