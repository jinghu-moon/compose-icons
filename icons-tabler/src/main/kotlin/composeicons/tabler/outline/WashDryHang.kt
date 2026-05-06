package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WashDryHang: ImageVector
    get() {
        if (_washDryHang != null) return _washDryHang!!
        _washDryHang = tablerOutlineIcon(
            name = "WashDryHang",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 6C3 4.343 4.343 3 6 3h12c1.657 0 3 1.343 3 3v12c0 1.657-1.343 3-3 3h-12C4.343 21 3 19.657 3 18v-12")
            addPathData("M4 4.01C9.333 9.333 14.667 9.33 20 4")
        }
        return _washDryHang!!
    }

private var _washDryHang: ImageVector? = null
