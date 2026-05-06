package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Router: ImageVector
    get() {
        if (_router != null) return _router!!
        _router = lucideOutlineIcon(
            name = "Router",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 14h16c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-16C2.895 22 2 21.105 2 20v-4c0-1.105 .895-2 2-2Z")
            addPathData("M6.01 18h-.01")
            addPathData("M10.01 18h-.01")
            addPathData("M15 10v4")
            addPathData("M17.84 7.17C17.09 6.419 16.072 5.997 15.01 5.997c-1.062 0-2.08 .422-2.83 1.173")
            addPathData("M20.66 4.34C17.536 1.218 12.474 1.218 9.35 4.34")
        }
        return _router!!
    }

private var _router: ImageVector? = null
