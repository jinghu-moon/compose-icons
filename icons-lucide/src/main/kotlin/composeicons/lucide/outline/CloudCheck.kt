package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CloudCheck: ImageVector
    get() {
        if (_cloudCheck != null) return _cloudCheck!!
        _cloudCheck = lucideOutlineIcon(
            name = "CloudCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 15l-5.5 5.5L9 18")
            addPathData("M5.516 16.07C2.788 14.503 1.44 11.309 2.221 8.261 3.002 5.214 5.72 3.062 8.866 3.001 12.012 2.94 14.811 4.985 15.71 8h1.79c1.733 0 3.313 .996 4.06 2.56 .747 1.564 .53 3.418-.559 4.767")
        }
        return _cloudCheck!!
    }

private var _cloudCheck: ImageVector? = null
