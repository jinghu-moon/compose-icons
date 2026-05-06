package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ripple: ImageVector
    get() {
        if (_ripple != null) return _ripple!!
        _ripple = tablerOutlineIcon(
            name = "Ripple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7C6 5 9 5 12 7c3 2 6 2 9 0")
            addPathData("M3 17c3-2 6-2 9 0 3 2 6 2 9 0")
            addPathData("M3 12c3-2 6-2 9 0 3 2 6 2 9 0")
        }
        return _ripple!!
    }

private var _ripple: ImageVector? = null
