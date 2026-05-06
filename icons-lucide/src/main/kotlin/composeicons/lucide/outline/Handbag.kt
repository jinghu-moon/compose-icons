package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Handbag: ImageVector
    get() {
        if (_handbag != null) return _handbag!!
        _handbag = lucideOutlineIcon(
            name = "Handbag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2.048 18.566c-.132 .592 .013 1.212 .392 1.685 .38 .473 .953 .749 1.56 .749h16c.607-0 1.18-.276 1.56-.749 .38-.473 .524-1.093 .392-1.685l-2-9C19.749 8.651 18.937 8 18 8h-12C5.063 8 4.251 8.651 4.048 9.566Z")
            addPathData("M8 11v-5C8 3.791 9.791 2 12 2c2.209 0 4 1.791 4 4v5")
        }
        return _handbag!!
    }

private var _handbag: ImageVector? = null
