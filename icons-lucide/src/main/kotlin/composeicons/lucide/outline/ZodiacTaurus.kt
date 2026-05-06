package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZodiacTaurus: ImageVector
    get() {
        if (_zodiacTaurus != null) return _zodiacTaurus!!
        _zodiacTaurus = lucideOutlineIcon(
            name = "ZodiacTaurus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 15c0 3.314-2.686 6-6 6C8.686 21 6 18.314 6 15 6 11.686 8.686 9 12 9c3.314 0 6 2.686 6 6Z")
            addPathData("M18 3c0 3.314-2.686 6-6 6C8.686 9 6 6.314 6 3")
        }
        return _zodiacTaurus!!
    }

private var _zodiacTaurus: ImageVector? = null
