package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandNordVpn: ImageVector
    get() {
        if (_brandNordVpn != null) return _brandNordVpn!!
        _brandNordVpn = tablerOutlineIcon(
            name = "BrandNordVpn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.992 15 7.985 12 3.97 20C1.758 16.939 1.345 12.902 3.055 9.537 4.771 6.168 8.219 4.034 12 4c3.781 .034 7.229 2.168 8.945 5.537 1.71 3.365 1.297 7.402-.915 10.463L15.513 12l-1.505 1.5")
            addPathData("M14.5 15l-3-6L9 13.5")
        }
        return _brandNordVpn!!
    }

private var _brandNordVpn: ImageVector? = null
