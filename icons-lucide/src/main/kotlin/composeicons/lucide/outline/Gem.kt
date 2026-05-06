package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Gem: ImageVector
    get() {
        if (_gem != null) return _gem!!
        _gem = lucideOutlineIcon(
            name = "Gem",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.5 3 8 9l4 13L16 9 13.5 3")
            addPathData("M17 3c.63 0 1.222 .296 1.6 .8l3 4c.528 .705 .534 1.672 .013 2.382L13.623 21.168c-.376 .522-.98 .832-1.623 .832-.644 0-1.248-.31-1.623-.832L2.386 10.182C1.866 9.472 1.871 8.504 2.4 7.8L5.398 3.803C5.776 3.298 6.369 3 7 3Z")
            addPathData("M2 9h20")
        }
        return _gem!!
    }

private var _gem: ImageVector? = null
