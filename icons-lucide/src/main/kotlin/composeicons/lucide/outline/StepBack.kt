package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.StepBack: ImageVector
    get() {
        if (_stepBack != null) return _stepBack!!
        _stepBack = lucideOutlineIcon(
            name = "StepBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.971 4.285c.618-.371 1.387-.38 2.014-.025C16.612 4.615 17 5.279 17 6v12c0 .721-.388 1.385-1.015 1.74-.627 .355-1.397 .345-2.014-.025L3.974 13.717c-.604-.361-.974-1.012-.974-1.715-.001-.703 .368-1.355 .971-1.717Z")
            addPathData("M21 20v-16")
        }
        return _stepBack!!
    }

private var _stepBack: ImageVector? = null
