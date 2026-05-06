package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Camera: ImageVector
    get() {
        if (_camera != null) return _camera!!
        _camera = lucideOutlineIcon(
            name = "Camera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.997 4c.735-0 1.411 .403 1.76 1.05l.486 .9c.349 .647 1.025 1.05 1.76 1.05h1.997c1.105 0 2 .895 2 2v9c0 1.105-.895 2-2 2h-16C2.895 20 2 19.105 2 18v-9C2 7.895 2.895 7 4 7h1.997c.734 0 1.409-.402 1.759-1.048l.489-.904C8.595 4.402 9.27 4 10.004 4Z")
            addPathData("M15 13c0 1.657-1.343 3-3 3C10.343 16 9 14.657 9 13c0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3Z")
        }
        return _camera!!
    }

private var _camera: ImageVector? = null
