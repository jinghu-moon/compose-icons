package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAdobeXd: ImageVector
    get() {
        if (_brandAdobeXd != null) return _brandAdobeXd!!
        _brandAdobeXd = tablerOutlineIcon(
            name = "BrandAdobeXd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12C3 7.757 3 5.636 4.318 4.318 5.636 3 7.758 3 12 3c4.242 0 6.364 0 7.682 1.318C21 5.636 21 7.758 21 12c0 4.242 0 6.364-1.318 7.682C18.364 21 16.242 21 12 21 7.758 21 5.636 21 4.318 19.682 3 18.364 3 16.242 3 12")
            addPathData("M6 8l5 8")
            addPathData("M6 16 11 8")
            addPathData("M18 11v4c0 1.1-.517 .997-1.5 .997C15.12 15.997 14.002 14.88 14 13.5 14 12.119 15.119 11 16.5 11h1.5v-3")
        }
        return _brandAdobeXd!!
    }

private var _brandAdobeXd: ImageVector? = null
