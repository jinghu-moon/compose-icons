package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LocationCode: ImageVector
    get() {
        if (_locationCode != null) return _locationCode!!
        _locationCode = tablerOutlineIcon(
            name = "LocationCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.505 17.01 10 14 3 10.5C2.804 10.41 2.679 10.215 2.679 10c0-.215 .125-.41 .321-.5L21 3 17.323 13.184")
            addPathData("M20 21l2-2L20 17")
            addPathData("M17 17l-2 2 2 2")
        }
        return _locationCode!!
    }

private var _locationCode: ImageVector? = null
