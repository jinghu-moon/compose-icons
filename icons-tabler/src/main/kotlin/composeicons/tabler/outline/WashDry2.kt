package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WashDry2: ImageVector
    get() {
        if (_washDry2 != null) return _washDry2!!
        _washDry2 = tablerOutlineIcon(
            name = "WashDry2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 6C3 4.343 4.343 3 6 3h12c1.657 0 3 1.343 3 3v12c0 1.657-1.343 3-3 3h-12C4.343 21 3 19.657 3 18v-12")
            addPathData("M6 12c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6C18 8.686 15.314 6 12 6 8.686 6 6 8.686 6 12")
            addPathData("M10 12h.01")
            addPathData("M14 12h.01")
        }
        return _washDry2!!
    }

private var _washDry2: ImageVector? = null
