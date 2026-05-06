package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAdobeAfterEffect: ImageVector
    get() {
        if (_brandAdobeAfterEffect != null) return _brandAdobeAfterEffect!!
        _brandAdobeAfterEffect = tablerOutlineIcon(
            name = "BrandAdobeAfterEffect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12C3 7.757 3 5.636 4.318 4.318 5.636 3 7.758 3 12 3c4.242 0 6.364 0 7.682 1.318C21 5.636 21 7.758 21 12c0 4.242 0 6.364-1.318 7.682C18.364 21 16.242 21 12 21 7.758 21 5.636 21 4.318 19.682 3 18.364 3 16.242 3 12")
            addPathData("M12 15.79l-.82-2.653M6.316 15.789l.82-2.652M7.136 13.137l.686-2.218C8.381 9.113 8.66 8.211 9.158 8.211c.498 0 .777 .902 1.335 2.708l.686 2.218M7.136 13.137h4.043")
            addPathData("M13.895 12.824v1.07c-.001 .859 .577 1.612 1.408 1.833 .83 .221 1.706-.145 2.132-.891M13.895 12.824v-.824c-0-1.047 .848-1.895 1.895-1.895 1.047 0 1.895 .848 1.895 1.895v.824h-3.79")
        }
        return _brandAdobeAfterEffect!!
    }

private var _brandAdobeAfterEffect: ImageVector? = null
