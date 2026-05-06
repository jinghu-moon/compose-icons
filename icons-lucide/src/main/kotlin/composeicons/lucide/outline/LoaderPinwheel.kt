package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LoaderPinwheel: ImageVector
    get() {
        if (_loaderPinwheel != null) return _loaderPinwheel!!
        _loaderPinwheel = lucideOutlineIcon(
            name = "LoaderPinwheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12c0 2.761-2.239 5-5 5-2.761 0-5-2.239-5-5C12 9.239 9.761 7 7 7 4.239 7 2 9.239 2 12")
            addPathData("M7 20.7C4.598 19.319 3.769 16.252 5.15 13.85 6.531 11.448 9.598 10.619 12 12c2.375 1.381 5.419 .575 6.8-1.8C20.181 7.825 19.375 4.781 17 3.4")
            addPathData("M7 3.3c2.375-1.381 5.419-.575 6.8 1.8 1.381 2.375 .575 5.419-1.8 6.8-2.375 1.381-3.181 4.425-1.8 6.8 1.381 2.375 4.425 3.181 6.8 1.8")
            addPathData("M22 12c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10Z")
        }
        return _loaderPinwheel!!
    }

private var _loaderPinwheel: ImageVector? = null
