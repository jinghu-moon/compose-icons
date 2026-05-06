package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LocationBroken: ImageVector
    get() {
        if (_locationBroken != null) return _locationBroken!!
        _locationBroken = tablerOutlineIcon(
            name = "LocationBroken",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.896 19.792 10 14 3 10.5C2.804 10.41 2.679 10.215 2.679 10c0-.215 .125-.41 .321-.5L21 3l-3.487 9.657")
            addPathData("M21.5 21.5l-5-5")
            addPathData("M16.5 21.5l5-5")
        }
        return _locationBroken!!
    }

private var _locationBroken: ImageVector? = null
