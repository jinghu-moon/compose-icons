package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LocationPause: ImageVector
    get() {
        if (_locationPause != null) return _locationPause!!
        _locationPause = tablerOutlineIcon(
            name = "LocationPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.02 20.04 10 14 3 10.5C2.804 10.41 2.679 10.215 2.679 10c0-.215 .125-.41 .321-.5L21 3 17.366 13.062")
            addPathData("M17 17v5")
            addPathData("M21 17v5")
        }
        return _locationPause!!
    }

private var _locationPause: ImageVector? = null
