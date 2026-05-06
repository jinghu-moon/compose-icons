package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZodiacSagittarius: ImageVector
    get() {
        if (_zodiacSagittarius != null) return _zodiacSagittarius!!
        _zodiacSagittarius = lucideOutlineIcon(
            name = "ZodiacSagittarius",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 3h6v6")
            addPathData("M21 3 3 21")
            addPathData("M9 9l6 6")
        }
        return _zodiacSagittarius!!
    }

private var _zodiacSagittarius: ImageVector? = null
