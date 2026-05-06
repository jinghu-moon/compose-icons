package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CirclePoundSterling: ImageVector
    get() {
        if (_circlePoundSterling != null) return _circlePoundSterling!!
        _circlePoundSterling = lucideOutlineIcon(
            name = "CirclePoundSterling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10Z")
            addPathData("M10 16v-6.5C10 8.119 11.119 7 12.5 7 13.881 7 15 8.119 15 9.5")
            addPathData("M8 12h4")
            addPathData("M8 16h7")
        }
        return _circlePoundSterling!!
    }

private var _circlePoundSterling: ImageVector? = null
