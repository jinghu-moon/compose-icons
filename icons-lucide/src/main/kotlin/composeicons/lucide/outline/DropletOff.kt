package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.DropletOff: ImageVector
    get() {
        if (_dropletOff != null) return _dropletOff!!
        _dropletOff = lucideOutlineIcon(
            name = "DropletOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.715 13.186C18.29 11.858 17.384 10.607 16 9.5 14 7.9 12.5 5.5 12 3c-.183 .896-.48 1.765-.884 2.586")
            addPathData("M2 2 22 22")
            addPathData("M8.795 8.797C8.541 9.044 8.276 9.279 8 9.5 6 11.1 5 13 5 15c-0 3.23 2.21 6.042 5.35 6.803 3.139 .762 6.392-.724 7.872-3.595")
        }
        return _dropletOff!!
    }

private var _dropletOff: ImageVector? = null
