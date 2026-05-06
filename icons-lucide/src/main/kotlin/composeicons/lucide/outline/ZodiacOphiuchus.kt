package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZodiacOphiuchus: ImageVector
    get() {
        if (_zodiacOphiuchus != null) return _zodiacOphiuchus!!
        _zodiacOphiuchus = lucideOutlineIcon(
            name = "ZodiacOphiuchus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 10C4.149 8.726 5.784 7.999 7.5 7.999c1.716 0 3.351 .727 4.5 2.001 1.149 1.274 2.784 2.001 4.5 2.001 1.716 0 3.351-.727 4.5-2.001")
            addPathData("M6 3v12c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-12")
        }
        return _zodiacOphiuchus!!
    }

private var _zodiacOphiuchus: ImageVector? = null
