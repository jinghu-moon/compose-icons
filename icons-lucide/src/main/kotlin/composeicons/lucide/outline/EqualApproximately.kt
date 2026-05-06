package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.EqualApproximately: ImageVector
    get() {
        if (_equalApproximately != null) return _equalApproximately!!
        _equalApproximately = lucideOutlineIcon(
            name = "EqualApproximately",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 15c2.134-1.364 4.866-1.364 7 0 2.134 1.364 4.866 1.364 7 0")
            addPathData("M5 9C7.134 7.636 9.866 7.636 12 9c2.134 1.364 4.866 1.364 7 0")
        }
        return _equalApproximately!!
    }

private var _equalApproximately: ImageVector? = null
