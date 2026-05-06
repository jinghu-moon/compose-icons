package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Tent: ImageVector
    get() {
        if (_tent != null) return _tent!!
        _tent = lucideOutlineIcon(
            name = "Tent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3.5 21 14 3")
            addPathData("M20.5 21 10 3")
            addPathData("M15.5 21 12 15 8.5 21")
            addPathData("M2 21h20")
        }
        return _tent!!
    }

private var _tent: ImageVector? = null
