package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Tally2: ImageVector
    get() {
        if (_tally2 != null) return _tally2!!
        _tally2 = lucideOutlineIcon(
            name = "Tally2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 4v16")
            addPathData("M9 4v16")
        }
        return _tally2!!
    }

private var _tally2: ImageVector? = null
