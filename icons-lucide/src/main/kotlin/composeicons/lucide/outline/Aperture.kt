package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Aperture: ImageVector
    get() {
        if (_aperture != null) return _aperture!!
        _aperture = lucideOutlineIcon(
            name = "Aperture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10Z")
            addPathData("M14.31 8l5.74 9.94")
            addPathData("M9.69 8h11.48")
            addPathData("M7.38 12 13.12 2.06")
            addPathData("M9.69 16 3.95 6.06")
            addPathData("M14.31 16h-11.48")
            addPathData("M16.62 12l-5.74 9.94")
        }
        return _aperture!!
    }

private var _aperture: ImageVector? = null
