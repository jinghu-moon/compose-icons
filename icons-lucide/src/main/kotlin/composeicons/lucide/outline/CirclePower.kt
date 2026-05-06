package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CirclePower: ImageVector
    get() {
        if (_circlePower != null) return _circlePower!!
        _circlePower = lucideOutlineIcon(
            name = "CirclePower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10Z")
            addPathData("M12 7v4")
            addPathData("M7.998 9.003c-1.546 2.064-1.269 4.965 .64 6.698 1.909 1.734 4.822 1.732 6.729-.004 1.906-1.736 2.18-4.637 .631-6.699")
        }
        return _circlePower!!
    }

private var _circlePower: ImageVector? = null
