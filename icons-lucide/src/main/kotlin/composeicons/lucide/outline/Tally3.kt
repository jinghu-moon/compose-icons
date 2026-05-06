package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Tally3: ImageVector
    get() {
        if (_tally3 != null) return _tally3!!
        _tally3 = lucideOutlineIcon(
            name = "Tally3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 4v16")
            addPathData("M9 4v16")
            addPathData("M14 4v16")
        }
        return _tally3!!
    }

private var _tally3: ImageVector? = null
