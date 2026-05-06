package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LocationBolt: ImageVector
    get() {
        if (_locationBolt != null) return _locationBolt!!
        _locationBolt = tablerOutlineIcon(
            name = "LocationBolt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.05 20.1 10 14 3 10.5C2.804 10.41 2.679 10.215 2.679 10c0-.215 .125-.41 .321-.5L21 3l-3.312 9.173")
            addPathData("M19 16l-2 3h4l-2 3")
        }
        return _locationBolt!!
    }

private var _locationBolt: ImageVector? = null
