package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MarsStroke: ImageVector
    get() {
        if (_marsStroke != null) return _marsStroke!!
        _marsStroke = lucideOutlineIcon(
            name = "MarsStroke",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 6l4 4")
            addPathData("M17 3h4v4")
            addPathData("M21 3l-7.75 7.75")
            addPathData("M15 15c0 3.314-2.686 6-6 6C5.686 21 3 18.314 3 15 3 11.686 5.686 9 9 9c3.314 0 6 2.686 6 6Z")
        }
        return _marsStroke!!
    }

private var _marsStroke: ImageVector? = null
