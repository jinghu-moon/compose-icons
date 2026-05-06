package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.XLineTop: ImageVector
    get() {
        if (_xLineTop != null) return _xLineTop!!
        _xLineTop = lucideOutlineIcon(
            name = "XLineTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 4h-12")
            addPathData("M18 8 6 20")
            addPathData("M6 8 18 20")
        }
        return _xLineTop!!
    }

private var _xLineTop: ImageVector? = null
