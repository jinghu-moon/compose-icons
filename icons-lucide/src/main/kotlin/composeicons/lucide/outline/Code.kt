package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Code: ImageVector
    get() {
        if (_code != null) return _code!!
        _code = lucideOutlineIcon(
            name = "Code",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 18l6-6L16 6")
            addPathData("M8 6 2 12l6 6")
        }
        return _code!!
    }

private var _code: ImageVector? = null
