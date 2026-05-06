package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LocationX: ImageVector
    get() {
        if (_locationX != null) return _locationX!!
        _locationX = tablerOutlineIcon(
            name = "LocationX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.5 21l-.224-.448L10 14 3 10.5C2.804 10.41 2.679 10.215 2.679 10c0-.215 .125-.41 .321-.5L21 3 17.378 13.03")
            addPathData("M22 22 17 17")
            addPathData("M17 22l5-5")
        }
        return _locationX!!
    }

private var _locationX: ImageVector? = null
