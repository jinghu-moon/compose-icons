package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LocationOff: ImageVector
    get() {
        if (_locationOff != null) return _locationOff!!
        _locationOff = tablerOutlineIcon(
            name = "LocationOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.72 6.712 21 3 17.276 13.313 16.22 16.238 14.5 21c-.09 .196-.285 .321-.5 .321-.215 0-.41-.125-.5-.321L10 14 3 10.5C2.804 10.41 2.679 10.215 2.679 10c0-.215 .125-.41 .321-.5L7.775 7.776")
            addPathData("M3 3 21 21")
        }
        return _locationOff!!
    }

private var _locationOff: ImageVector? = null
