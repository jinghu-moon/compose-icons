package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CloudLightning: ImageVector
    get() {
        if (_cloudLightning != null) return _cloudLightning!!
        _cloudLightning = lucideOutlineIcon(
            name = "CloudLightning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 16.326C3.097 14.948 1.506 11.77 2.141 8.62 2.775 5.47 5.473 3.157 8.683 3.01 11.893 2.863 14.791 4.921 15.71 8h1.79c2.391-.004 4.368 1.862 4.501 4.25 .133 2.387-1.624 4.462-4.001 4.723")
            addPathData("M13 12l-3 5h4l-3 5")
        }
        return _cloudLightning!!
    }

private var _cloudLightning: ImageVector? = null
