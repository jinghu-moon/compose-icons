package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAdobeIndesign: ImageVector
    get() {
        if (_brandAdobeIndesign != null) return _brandAdobeIndesign!!
        _brandAdobeIndesign = tablerOutlineIcon(
            name = "BrandAdobeIndesign",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12C3 7.757 3 5.636 4.318 4.318 5.636 3 7.758 3 12 3c4.242 0 6.364 0 7.682 1.318C21 5.636 21 7.758 21 12c0 4.242 0 6.364-1.318 7.682C18.364 21 16.242 21 12 21 7.758 21 5.636 21 4.318 19.682 3 18.364 3 16.242 3 12")
            addPathData("M15 11v4c0 1.1-.657 .997-1.6 .997-.642-.002-1.255-.266-1.697-.731-.453-.476-.705-1.109-.703-1.767 0-.663 .253-1.299 .703-1.767 .442-.466 1.055-.73 1.697-.732h1.6")
            addPathData("M15 11v-3")
            addPathData("M8 8v8")
        }
        return _brandAdobeIndesign!!
    }

private var _brandAdobeIndesign: ImageVector? = null
