package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ALargeSmall: ImageVector
    get() {
        if (_aLargeSmall != null) return _aLargeSmall!!
        _aLargeSmall = lucideOutlineIcon(
            name = "ALargeSmall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 16 17.536 8.672c.142-.411 .529-.687 .964-.687 .435 0 .822 .276 .964 .687L22 16")
            addPathData("M15.697 14h5.606")
            addPathData("M2 16 6.039 6.31c.078-.186 .26-.308 .462-.308 .202 0 .384 .121 .461 .308L11 16")
            addPathData("M3.304 13h6.392")
        }
        return _aLargeSmall!!
    }

private var _aLargeSmall: ImageVector? = null
