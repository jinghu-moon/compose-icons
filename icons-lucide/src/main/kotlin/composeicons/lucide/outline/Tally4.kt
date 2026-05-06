package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Tally4: ImageVector
    get() {
        if (_tally4 != null) return _tally4!!
        _tally4 = lucideOutlineIcon(
            name = "Tally4",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 4v16")
            addPathData("M9 4v16")
            addPathData("M14 4v16")
            addPathData("M19 4v16")
        }
        return _tally4!!
    }

private var _tally4: ImageVector? = null
