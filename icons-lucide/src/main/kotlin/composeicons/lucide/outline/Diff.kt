package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Diff: ImageVector
    get() {
        if (_diff != null) return _diff!!
        _diff = lucideOutlineIcon(
            name = "Diff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3v14")
            addPathData("M5 10h14")
            addPathData("M5 21h14")
        }
        return _diff!!
    }

private var _diff: ImageVector? = null
