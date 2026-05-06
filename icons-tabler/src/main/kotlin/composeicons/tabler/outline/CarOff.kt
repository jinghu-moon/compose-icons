package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CarOff: ImageVector
    get() {
        if (_carOff != null) return _carOff!!
        _carOff = tablerOutlineIcon(
            name = "CarOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C9 15.895 8.105 15 7 15c-1.105 0-2 .895-2 2")
            addPathData("M15.584 15.588c-.781 .781-.782 2.048-.001 2.829 .781 .781 2.048 .782 2.829 .001")
            addPathData("M5 17h-2v-6L5 6h1M10 6h4l4 5h1c1.105 0 2 .895 2 2v4M15 17h-6M3 11h8M15 11h3M12 8v-2")
            addPathData("M3 3 21 21")
        }
        return _carOff!!
    }

private var _carOff: ImageVector? = null
