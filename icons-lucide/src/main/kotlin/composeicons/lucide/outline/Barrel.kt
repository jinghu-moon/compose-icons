package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Barrel: ImageVector
    get() {
        if (_barrel != null) return _barrel!!
        _barrel = lucideOutlineIcon(
            name = "Barrel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 3C8.667 8.926 8.667 15.074 10 21")
            addPathData("M14 3c1.333 5.926 1.333 12.074 0 18")
            addPathData("M17 3c.68 .001 1.313 .348 1.68 .92 3.089 4.944 3.089 11.216 0 16.16-.367 .572-1 .919-1.68 .92h-10c-.68-.001-1.313-.348-1.68-.92C2.231 15.136 2.231 8.864 5.32 3.92 5.687 3.348 6.32 3.001 7 3Z")
            addPathData("M3.84 17h16.32")
            addPathData("M3.84 7h16.32")
        }
        return _barrel!!
    }

private var _barrel: ImageVector? = null
