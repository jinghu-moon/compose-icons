package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Transform: ImageVector
    get() {
        if (_transform != null) return _transform!!
        _transform = tablerOutlineIcon(
            name = "Transform",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 6C3 7.657 4.343 9 6 9 7.657 9 9 7.657 9 6 9 4.343 7.657 3 6 3 4.343 3 3 4.343 3 6")
            addPathData("M21 11v-3C21 6.895 20.105 6 19 6h-6l3 3M16 3 13 6")
            addPathData("M3 13v3c0 1.105 .895 2 2 2h6L8 15M8 21l3-3")
            addPathData("M15 18c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
        }
        return _transform!!
    }

private var _transform: ImageVector? = null
