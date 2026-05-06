package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CloudAlert: ImageVector
    get() {
        if (_cloudAlert != null) return _cloudAlert!!
        _cloudAlert = lucideOutlineIcon(
            name = "CloudAlert",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12v4")
            addPathData("M12 20h.01")
            addPathData("M8.128 16.949C4.663 16.512 2.05 13.589 2.004 10.097 1.957 6.604 4.492 3.612 7.945 3.084 11.397 2.556 14.71 4.654 15.71 8h1.79C19.985 8 22 10.015 22 12.5 22 14.985 19.985 17 17.5 17h-1.642")
        }
        return _cloudAlert!!
    }

private var _cloudAlert: ImageVector? = null
