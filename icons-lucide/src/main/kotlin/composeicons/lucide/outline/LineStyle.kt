package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LineStyle: ImageVector
    get() {
        if (_lineStyle != null) return _lineStyle!!
        _lineStyle = lucideOutlineIcon(
            name = "LineStyle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 5h2")
            addPathData("M15 12h6")
            addPathData("M19 5h2")
            addPathData("M3 12h6")
            addPathData("M3 19h18")
            addPathData("M3 5h2")
        }
        return _lineStyle!!
    }

private var _lineStyle: ImageVector? = null
