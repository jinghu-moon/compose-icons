package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LocationDown: ImageVector
    get() {
        if (_locationDown != null) return _locationDown!!
        _locationDown = tablerOutlineIcon(
            name = "LocationDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 18 10 14 3 10.5C2.804 10.41 2.679 10.215 2.679 10c0-.215 .125-.41 .321-.5L21 3l-3.328 9.217")
            addPathData("M19 16v6")
            addPathData("M22 19l-3 3L16 19")
        }
        return _locationDown!!
    }

private var _locationDown: ImageVector? = null
