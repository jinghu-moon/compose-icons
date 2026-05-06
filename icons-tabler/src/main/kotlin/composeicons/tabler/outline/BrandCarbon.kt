package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCarbon: ImageVector
    get() {
        if (_brandCarbon != null) return _brandCarbon!!
        _brandCarbon = tablerOutlineIcon(
            name = "BrandCarbon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 10v-.2C14 8.806 13.194 8 12.2 8h-.4C10.806 8 10 8.806 10 9.8v4.4c0 .994 .806 1.8 1.8 1.8h.4C13.194 16 14 15.194 14 14.2v-.2")
            addPathData("M3 6C3 4.343 4.343 3 6 3h12c1.657 0 3 1.343 3 3v12c0 1.657-1.343 3-3 3h-12C4.343 21 3 19.657 3 18v-12")
        }
        return _brandCarbon!!
    }

private var _brandCarbon: ImageVector? = null
