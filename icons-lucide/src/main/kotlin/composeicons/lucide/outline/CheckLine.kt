package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CheckLine: ImageVector
    get() {
        if (_checkLine != null) return _checkLine!!
        _checkLine = lucideOutlineIcon(
            name = "CheckLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 4 9 15")
            addPathData("M21 19h-18")
            addPathData("M9 15 4 10")
        }
        return _checkLine!!
    }

private var _checkLine: ImageVector? = null
