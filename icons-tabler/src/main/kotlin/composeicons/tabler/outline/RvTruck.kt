package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RvTruck: ImageVector
    get() {
        if (_rvTruck != null) return _rvTruck!!
        _rvTruck = tablerOutlineIcon(
            name = "RvTruck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C9 15.895 8.105 15 7 15c-1.105 0-2 .895-2 2")
            addPathData("M15 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M9 17h6")
            addPathData("M19 17h1c.552 0 1-.448 1-1v-4.528c-0-.31-.072-.616-.211-.894L19.829 8.658C19.321 7.642 18.282 7 17.146 7h-11.146C4.343 7 3 8.343 3 10v6c0 .552 .448 1 1 1h1")
            addPathData("M3 12h18")
            addPathData("M15 12v-5")
            addPathData("M6 5.5C6 4.672 6.672 4 7.5 4h7C15.328 4 16 4.672 16 5.5 16 6.328 15.328 7 14.5 7h-7C6.672 7 6 6.328 6 5.5")
        }
        return _rvTruck!!
    }

private var _rvTruck: ImageVector? = null
