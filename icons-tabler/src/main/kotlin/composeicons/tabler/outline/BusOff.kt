package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BusOff: ImageVector
    get() {
        if (_busOff != null) return _busOff!!
        _busOff = tablerOutlineIcon(
            name = "BusOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C8 15.895 7.105 15 6 15c-1.105 0-2 .895-2 2")
            addPathData("M16.18 16.172c-.346 .76-.184 1.655 .407 2.245 .591 .59 1.486 .751 2.245 .403")
            addPathData("M4 17h-2v-11C2 5.448 2.448 5 3 5h2M9 5h8c2.761 0 5 3.134 5 7v5h-1M16 17h-8")
            addPathData("M16 5l1.5 7h4.5")
            addPathData("M2 10h8M14 10h3")
            addPathData("M7 7v3")
            addPathData("M12 5v3")
            addPathData("M3 3 21 21")
        }
        return _busOff!!
    }

private var _busOff: ImageVector? = null
