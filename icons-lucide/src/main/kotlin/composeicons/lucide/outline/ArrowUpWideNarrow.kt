package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowUpWideNarrow: ImageVector
    get() {
        if (_arrowUpWideNarrow != null) return _arrowUpWideNarrow!!
        _arrowUpWideNarrow = lucideOutlineIcon(
            name = "ArrowUpWideNarrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 8 7 4l4 4")
            addPathData("M7 4v16")
            addPathData("M11 12h10")
            addPathData("M11 16h7")
            addPathData("M11 20h4")
        }
        return _arrowUpWideNarrow!!
    }

private var _arrowUpWideNarrow: ImageVector? = null
