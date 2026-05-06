package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EmergencyBed: ImageVector
    get() {
        if (_emergencyBed != null) return _emergencyBed!!
        _emergencyBed = tablerOutlineIcon(
            name = "EmergencyBed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 18c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M6 18c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C10 16.895 9.105 16 8 16c-1.105 0-2 .895-2 2")
            addPathData("M4 8l2.1 2.8C6.667 11.555 7.556 12 8.5 12h11.5")
            addPathData("M10 6h4")
            addPathData("M12 4v4")
            addPathData("M12 12v2L9.5 16.5")
            addPathData("M14.5 16.5 12 14")
        }
        return _emergencyBed!!
    }

private var _emergencyBed: ImageVector? = null
