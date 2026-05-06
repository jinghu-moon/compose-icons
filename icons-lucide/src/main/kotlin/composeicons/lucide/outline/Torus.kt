package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Torus: ImageVector
    get() {
        if (_torus != null) return _torus!!
        _torus = lucideOutlineIcon(
            name = "Torus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 11c0 1.105-1.343 2-3 2C10.343 13 9 12.105 9 11 9 9.895 10.343 9 12 9c1.657 0 3 .895 3 2Z")
            addPathData("M22 12.5C22 17.194 17.523 21 12 21 6.477 21 2 17.194 2 12.5 2 7.806 6.477 4 12 4c5.523 0 10 3.806 10 8.5Z")
        }
        return _torus!!
    }

private var _torus: ImageVector? = null
