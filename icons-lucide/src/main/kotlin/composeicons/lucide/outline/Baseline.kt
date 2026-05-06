package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Baseline: ImageVector
    get() {
        if (_baseline != null) return _baseline!!
        _baseline = lucideOutlineIcon(
            name = "Baseline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 20h16")
            addPathData("M6 16 12 4l6 12")
            addPathData("M8 12h8")
        }
        return _baseline!!
    }

private var _baseline: ImageVector? = null
