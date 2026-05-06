package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WashDryShade: ImageVector
    get() {
        if (_washDryShade != null) return _washDryShade!!
        _washDryShade = tablerOutlineIcon(
            name = "WashDryShade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 6C3 4.343 4.343 3 6 3h12c1.657 0 3 1.343 3 3v12c0 1.657-1.343 3-3 3h-12C4.343 21 3 19.657 3 18v-12")
            addPathData("M3 11 11 3")
            addPathData("M3 17 17 3")
        }
        return _washDryShade!!
    }

private var _washDryShade: ImageVector? = null
