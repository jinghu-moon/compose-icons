package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CircleQuestionMark: ImageVector
    get() {
        if (_circleQuestionMark != null) return _circleQuestionMark!!
        _circleQuestionMark = lucideOutlineIcon(
            name = "CircleQuestionMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10Z")
            addPathData("M9.09 9C9.575 7.62 10.985 6.791 12.427 7.039c1.442 .247 2.495 1.498 2.493 2.961 0 2-3 3-3 3")
            addPathData("M12 17h.01")
        }
        return _circleQuestionMark!!
    }

private var _circleQuestionMark: ImageVector? = null
