package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LocationDiscount: ImageVector
    get() {
        if (_locationDiscount != null) return _locationDiscount!!
        _locationDiscount = tablerOutlineIcon(
            name = "LocationDiscount",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.797 19.595 10 14 3 10.5C2.804 10.41 2.679 10.215 2.679 10c0-.215 .125-.41 .321-.5L21 3l-3.548 9.826")
            addPathData("M16 21l5-5")
            addPathData("M21 21v.01")
            addPathData("M16 16v.01")
        }
        return _locationDiscount!!
    }

private var _locationDiscount: ImageVector? = null
