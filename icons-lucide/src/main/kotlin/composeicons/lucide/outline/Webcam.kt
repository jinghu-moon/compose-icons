package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Webcam: ImageVector
    get() {
        if (_webcam != null) return _webcam!!
        _webcam = lucideOutlineIcon(
            name = "Webcam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 10c0 4.418-3.582 8-8 8C7.582 18 4 14.418 4 10 4 5.582 7.582 2 12 2c4.418 0 8 3.582 8 8Z")
            addPathData("M15 10c0 1.657-1.343 3-3 3C10.343 13 9 11.657 9 10 9 8.343 10.343 7 12 7c1.657 0 3 1.343 3 3Z")
            addPathData("M7 22h10")
            addPathData("M12 22v-4")
        }
        return _webcam!!
    }

private var _webcam: ImageVector? = null
