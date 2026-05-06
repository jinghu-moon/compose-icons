package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Spy: ImageVector
    get() {
        if (_spy != null) return _spy!!
        _spy = tablerOutlineIcon(
            name = "Spy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 11h18")
            addPathData("M5 11v-4C5 5.343 6.343 4 8 4h8c1.657 0 3 1.343 3 3v4")
            addPathData("M4 17c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C10 15.343 8.657 14 7 14 5.343 14 4 15.343 4 17")
            addPathData("M14 17c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M10 17h4")
        }
        return _spy!!
    }

private var _spy: ImageVector? = null
