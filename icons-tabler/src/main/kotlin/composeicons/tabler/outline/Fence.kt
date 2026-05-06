package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Fence: ImageVector
    get() {
        if (_fence != null) return _fence!!
        _fence = tablerOutlineIcon(
            name = "Fence",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12v4h16v-4h-16")
            addPathData("M6 16v4h4v-4M10 12v-6L8 4 6 6v6")
            addPathData("M14 16v4h4v-4M18 12v-6L16 4 14 6v6")
        }
        return _fence!!
    }

private var _fence: ImageVector? = null
