package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAdobePhotoshop: ImageVector
    get() {
        if (_brandAdobePhotoshop != null) return _brandAdobePhotoshop!!
        _brandAdobePhotoshop = tablerOutlineIcon(
            name = "BrandAdobePhotoshop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12C3 7.757 3 5.636 4.318 4.318 5.636 3 7.758 3 12 3c4.242 0 6.364 0 7.682 1.318C21 5.636 21 7.758 21 12c0 4.242 0 6.364-1.318 7.682C18.364 21 16.242 21 12 21 7.758 21 5.636 21 4.318 19.682 3 18.364 3 16.242 3 12")
            addPathData("M6.79 15.79v-3.79M6.79 12v-2.724c0-.11 0-.165 .004-.211 .044-.45 .4-.806 .85-.85 .046-.004 .101-.004 .211-.004h1.303c.687-.016 1.329 .342 1.677 .934 .348 .593 .348 1.327 0 1.92-.348 .593-.99 .95-1.677 .934h-2.368")
            addPathData("M17.178 11.263c-.164-.659-.935-1.158-1.862-1.158-1.047 0-1.895 .637-1.895 1.421 0 .785 .848 1.421 1.895 1.421 1.046 0 1.895 .637 1.895 1.421 0 .785-.849 1.421-1.895 1.421-.93 0-1.704-.502-1.864-1.165")
        }
        return _brandAdobePhotoshop!!
    }

private var _brandAdobePhotoshop: ImageVector? = null
