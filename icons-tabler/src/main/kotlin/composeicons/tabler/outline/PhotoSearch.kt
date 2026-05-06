package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PhotoSearch: ImageVector
    get() {
        if (_photoSearch != null) return _photoSearch!!
        _photoSearch = tablerOutlineIcon(
            name = "PhotoSearch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 8h.01")
            addPathData("M11.5 21h-5.5C4.343 21 3 19.657 3 18v-12C3 4.343 4.343 3 6 3h12c1.657 0 3 1.343 3 3v5.5")
            addPathData("M15 18c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M20.2 20.2 22 22")
            addPathData("M3 16 8 11c.928-.893 2.072-.893 3 0l2 2")
        }
        return _photoSearch!!
    }

private var _photoSearch: ImageVector? = null
