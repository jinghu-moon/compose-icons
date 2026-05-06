package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BeanOff: ImageVector
    get() {
        if (_beanOff != null) return _beanOff!!
        _beanOff = lucideOutlineIcon(
            name = "BeanOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 9c-.64 .64-1.521 .954-2.402 1.165-2.959 .709-4.919 3.52-4.561 6.541C2.395 19.727 4.958 22.002 8 22c3.714 .005 7.277-1.471 9.9-4.1")
            addPathData("M10.75 5.093C12.075 2.699 14.852 1.504 17.501 2.189 20.15 2.873 22.001 5.264 22 8c0 2.411-.61 4.68-1.683 6.66")
            addPathData("M5.341 10.62c.534 1.206 1.628 2.072 2.925 2.313 1.297 .241 2.629-.172 3.562-1.105M10.62 5.341c.909 .404 1.635 1.131 2.039 2.04")
            addPathData("M2 2 22 22")
        }
        return _beanOff!!
    }

private var _beanOff: ImageVector? = null
