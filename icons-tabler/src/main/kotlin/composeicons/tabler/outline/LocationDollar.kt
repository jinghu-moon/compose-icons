package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LocationDollar: ImageVector
    get() {
        if (_locationDollar != null) return _locationDollar!!
        _locationDollar = tablerOutlineIcon(
            name = "LocationDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.08 20.162 10 14 3 10.5C2.804 10.41 2.679 10.215 2.679 10c0-.215 .125-.41 .321-.5L21 3l-2.55 7.063")
            addPathData("M21 15h-2.5C17.672 15 17 15.672 17 16.5c0 .828 .672 1.5 1.5 1.5h1c.828 0 1.5 .672 1.5 1.5C21 20.328 20.328 21 19.5 21h-2.5")
            addPathData("M19 21v1M19 14v1")
        }
        return _locationDollar!!
    }

private var _locationDollar: ImageVector? = null
