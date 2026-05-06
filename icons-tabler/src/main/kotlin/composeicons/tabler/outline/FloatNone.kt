package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FloatNone: ImageVector
    get() {
        if (_floatNone != null) return _floatNone!!
        _floatNone = tablerOutlineIcon(
            name = "FloatNone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6C4 5.448 4.448 5 5 5h4c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-4C4.448 11 4 10.552 4 10v-4")
            addPathData("M4 15h16")
            addPathData("M4 19h16")
        }
        return _floatNone!!
    }

private var _floatNone: ImageVector? = null
