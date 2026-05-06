package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Tornado: ImageVector
    get() {
        if (_tornado != null) return _tornado!!
        _tornado = lucideOutlineIcon(
            name = "Tornado",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 4h-18")
            addPathData("M18 8h-12")
            addPathData("M19 12h-10")
            addPathData("M16 16h-6")
            addPathData("M11 20h-2")
        }
        return _tornado!!
    }

private var _tornado: ImageVector? = null
