package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Tablets: ImageVector
    get() {
        if (_tablets != null) return _tablets!!
        _tablets = lucideOutlineIcon(
            name = "Tablets",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 7c0 2.761-2.239 5-5 5C4.239 12 2 9.761 2 7 2 4.239 4.239 2 7 2c2.761 0 5 2.239 5 5Z")
            addPathData("M22 17c0 2.761-2.239 5-5 5-2.761 0-5-2.239-5-5 0-2.761 2.239-5 5-5 2.761 0 5 2.239 5 5Z")
            addPathData("M12 17h10")
            addPathData("M3.46 10.54 10.54 3.46")
        }
        return _tablets!!
    }

private var _tablets: ImageVector? = null
