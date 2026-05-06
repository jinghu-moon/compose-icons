package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SkipBack: ImageVector
    get() {
        if (_skipBack != null) return _skipBack!!
        _skipBack = lucideOutlineIcon(
            name = "SkipBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.971 4.285c.618-.371 1.387-.38 2.014-.025C20.612 4.615 21 5.279 21 6v12c0 .721-.388 1.385-1.015 1.74-.627 .355-1.397 .345-2.014-.025L7.974 13.717c-.604-.361-.974-1.012-.974-1.715-.001-.703 .368-1.355 .971-1.717Z")
            addPathData("M3 20v-16")
        }
        return _skipBack!!
    }

private var _skipBack: ImageVector? = null
