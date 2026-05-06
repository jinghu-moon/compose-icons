package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LocationCheck: ImageVector
    get() {
        if (_locationCheck != null) return _locationCheck!!
        _locationCheck = tablerOutlineIcon(
            name = "LocationCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.512 17.023 10 14 3 10.5C2.804 10.41 2.679 10.215 2.679 10c0-.215 .125-.41 .321-.5L21 3 16.55 15.324")
            addPathData("M15 19l2 2 4-4")
        }
        return _locationCheck!!
    }

private var _locationCheck: ImageVector? = null
