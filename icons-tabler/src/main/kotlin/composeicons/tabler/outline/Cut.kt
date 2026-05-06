package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cut: ImageVector
    get() {
        if (_cut != null) return _cut!!
        _cut = tablerOutlineIcon(
            name = "Cut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 17c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C10 15.343 8.657 14 7 14 5.343 14 4 15.343 4 17")
            addPathData("M14 17c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M9.15 14.85 18 4")
            addPathData("M6 4l8.85 10.85")
        }
        return _cut!!
    }

private var _cut: ImageVector? = null
