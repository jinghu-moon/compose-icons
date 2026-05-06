package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZodiacLibra: ImageVector
    get() {
        if (_zodiacLibra != null) return _zodiacLibra!!
        _zodiacLibra = lucideOutlineIcon(
            name = "ZodiacLibra",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 16h6.857c.162-.012 .19-.323 .038-.38C7.179 14.602 5.58 11.786 6.097 8.932 6.615 6.077 9.1 4.002 12.001 4.002c2.901 0 5.386 2.075 5.904 4.93 .517 2.854-1.081 5.67-3.798 6.688-.153 .057-.125 .368 .038 .38h6.855")
            addPathData("M3 20h18")
        }
        return _zodiacLibra!!
    }

private var _zodiacLibra: ImageVector? = null
