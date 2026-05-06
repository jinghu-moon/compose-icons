package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowDownNarrowWide: ImageVector
    get() {
        if (_arrowDownNarrowWide != null) return _arrowDownNarrowWide!!
        _arrowDownNarrowWide = lucideOutlineIcon(
            name = "ArrowDownNarrowWide",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 16l4 4 4-4")
            addPathData("M7 20v-16")
            addPathData("M11 4h4")
            addPathData("M11 8h7")
            addPathData("M11 12h10")
        }
        return _arrowDownNarrowWide!!
    }

private var _arrowDownNarrowWide: ImageVector? = null
