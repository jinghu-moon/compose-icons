package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Xxx: ImageVector
    get() {
        if (_xxx != null) return _xxx!!
        _xxx = tablerOutlineIcon(
            name = "Xxx",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 8l4 8")
            addPathData("M10 16 14 8")
            addPathData("M17 8l4 8")
            addPathData("M17 16 21 8")
            addPathData("M3 8l4 8")
            addPathData("M3 16 7 8")
        }
        return _xxx!!
    }

private var _xxx: ImageVector? = null
