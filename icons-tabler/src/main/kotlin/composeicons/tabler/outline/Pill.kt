package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Pill: ImageVector
    get() {
        if (_pill != null) return _pill!!
        _pill = tablerOutlineIcon(
            name = "Pill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.5 12.5l8-8c1.933-1.933 5.067-1.933 7 0 1.933 1.933 1.933 5.067 0 7l-8 8c-1.933 1.933-5.067 1.933-7 0-1.933-1.933-1.933-5.067 0-7")
            addPathData("M8.5 8.5l7 7")
        }
        return _pill!!
    }

private var _pill: ImageVector? = null
