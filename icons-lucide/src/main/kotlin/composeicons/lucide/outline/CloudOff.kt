package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CloudOff: ImageVector
    get() {
        if (_cloudOff != null) return _cloudOff!!
        _cloudOff = lucideOutlineIcon(
            name = "CloudOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.94 5.274c2.291 .66 4.089 2.441 4.77 4.726h1.79c1.472 0 2.85 .72 3.692 1.927 .841 1.207 1.04 2.75 .53 4.13")
            addPathData("M18.796 18.81c-.42 .126-.857 .19-1.296 .19h-8.5C5.771 18.999 2.961 16.79 2.199 13.652 1.437 10.514 2.921 7.261 5.79 5.78")
            addPathData("M2 2 22 22")
        }
        return _cloudOff!!
    }

private var _cloudOff: ImageVector? = null
