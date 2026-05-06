package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Magnet: ImageVector
    get() {
        if (_magnet != null) return _magnet!!
        _magnet = lucideOutlineIcon(
            name = "Magnet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 15l4 4")
            addPathData("M2.352 10.648c-.47 .471-.47 1.233 0 1.704l2.296 2.296c.471 .47 1.233 .47 1.704 0L12.381 8.619c.828-.828 2.172-.828 3 0 .828 .828 .828 2.172 0 3L9.352 17.648c-.47 .471-.47 1.233 0 1.704l2.296 2.296c.471 .47 1.233 .47 1.704 0l6.365-6.367c3.037-3.038 3.037-7.963-.001-11C16.678 1.244 11.753 1.244 8.716 4.282Z")
            addPathData("M5 8l4 4")
        }
        return _magnet!!
    }

private var _magnet: ImageVector? = null
