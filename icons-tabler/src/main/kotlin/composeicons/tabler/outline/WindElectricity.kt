package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WindElectricity: ImageVector
    get() {
        if (_windElectricity != null) return _windElectricity!!
        _windElectricity = tablerOutlineIcon(
            name = "WindElectricity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 7l-3 5h4l-3 5")
            addPathData("M3 16h4c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2")
            addPathData("M3 12h8c1.105 0 2-.895 2-2C13 8.895 12.105 8 11 8")
            addPathData("M3 8h3C7.105 8 8 7.105 8 6 8 4.895 7.105 4 6 4")
        }
        return _windElectricity!!
    }

private var _windElectricity: ImageVector? = null
