package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandOpenvpn: ImageVector
    get() {
        if (_brandOpenvpn != null) return _brandOpenvpn!!
        _brandOpenvpn = tablerOutlineIcon(
            name = "BrandOpenvpn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.618 20.243 13.425 14.641c1.209-.652 1.821-2.043 1.484-3.375C14.573 9.934 13.374 9.001 12 9.001c-1.374 0-2.572 .933-2.909 2.265-.336 1.332 .275 2.722 1.484 3.375L8.383 20.244")
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
        }
        return _brandOpenvpn!!
    }

private var _brandOpenvpn: ImageVector? = null
