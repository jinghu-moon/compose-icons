package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrentLocation: ImageVector
    get() {
        if (_currentLocation != null) return _currentLocation!!
        _currentLocation = tablerOutlineIcon(
            name = "CurrentLocation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 10.343 13.657 9 12 9 10.343 9 9 10.343 9 12")
            addPathData("M4 12c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C20 7.582 16.418 4 12 4 7.582 4 4 7.582 4 12")
            addPathData("M12 2v2")
            addPathData("M12 20v2")
            addPathData("M20 12h2")
            addPathData("M2 12h2")
        }
        return _currentLocation!!
    }

private var _currentLocation: ImageVector? = null
