package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Rocket: ImageVector
    get() {
        if (_rocket != null) return _rocket!!
        _rocket = lucideOutlineIcon(
            name = "Rocket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 15v5c0 0 3.03-.55 4-2 1.08-1.62 0-5 0-5")
            addPathData("M4.5 16.5c-1.5 1.26-2 5-2 5 0 0 3.74-.5 5-2 .71-.84 .7-2.13-.09-2.91-.805-.768-2.059-.807-2.91-.09")
            addPathData("M9 12c.532-1.381 1.202-2.704 2-3.95C13.369 4.262 17.532 1.972 22 2c0 2.72-.78 7.5-6 11-1.263 .798-2.603 1.468-4 2Z")
            addPathData("M9 12h-5C4 12 4.55 8.97 6 8c1.62-1.08 5 .05 5 .05")
        }
        return _rocket!!
    }

private var _rocket: ImageVector? = null
