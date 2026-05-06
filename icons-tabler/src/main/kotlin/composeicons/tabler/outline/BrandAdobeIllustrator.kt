package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAdobeIllustrator: ImageVector
    get() {
        if (_brandAdobeIllustrator != null) return _brandAdobeIllustrator!!
        _brandAdobeIllustrator = tablerOutlineIcon(
            name = "BrandAdobeIllustrator",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12C3 7.757 3 5.636 4.318 4.318 5.636 3 7.758 3 12 3c4.242 0 6.364 0 7.682 1.318C21 5.636 21 7.758 21 12c0 4.242 0 6.364-1.318 7.682C18.364 21 16.242 21 12 21 7.758 21 5.636 21 4.318 19.682 3 18.364 3 16.242 3 12")
            addPathData("M12.947 15.79l-.82-2.653M7.263 15.789l.82-2.652M8.083 13.137l.687-2.218C9.328 9.113 9.608 8.211 10.105 8.211c.498 0 .777 .902 1.336 2.708l.686 2.218M8.084 13.137h4.043")
            addPathData("M15.789 15.789v-4.736")
            addPathData("M15.789 8.684v-.473")
        }
        return _brandAdobeIllustrator!!
    }

private var _brandAdobeIllustrator: ImageVector? = null
