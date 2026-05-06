package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CameraOff: ImageVector
    get() {
        if (_cameraOff != null) return _cameraOff!!
        _cameraOff = lucideOutlineIcon(
            name = "CameraOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.564 14.558c-.646 1.064-1.882 1.619-3.107 1.393C10.233 15.726 9.275 14.768 9.049 13.544c-.225-1.224 .329-2.461 1.393-3.107")
            addPathData("M2 2 22 22")
            addPathData("M20 20h-16C2.895 20 2 19.105 2 18v-9C2 7.895 2.895 7 4 7h1.997c.282 0 .561-.06 .819-.175")
            addPathData("M9.695 4.024c.102-.016 .206-.024 .309-.024h3.993c.735-0 1.411 .403 1.76 1.05l.486 .9c.349 .647 1.025 1.05 1.76 1.05h1.997c1.105 0 2 .895 2 2v7.344")
        }
        return _cameraOff!!
    }

private var _cameraOff: ImageVector? = null
