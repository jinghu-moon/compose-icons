package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FloatCenter: ImageVector
    get() {
        if (_floatCenter != null) return _floatCenter!!
        _floatCenter = tablerOutlineIcon(
            name = "FloatCenter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 6C9 5.448 9.448 5 10 5h4c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-4C9.448 11 9 10.552 9 10v-4")
            addPathData("M4 7h1")
            addPathData("M4 11h1")
            addPathData("M19 7h1")
            addPathData("M19 11h1")
            addPathData("M4 15h16")
            addPathData("M4 19h16")
        }
        return _floatCenter!!
    }

private var _floatCenter: ImageVector? = null
