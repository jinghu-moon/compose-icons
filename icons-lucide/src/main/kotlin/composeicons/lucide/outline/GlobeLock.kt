package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GlobeLock: ImageVector
    get() {
        if (_globeLock != null) return _globeLock!!
        _globeLock = lucideOutlineIcon(
            name = "GlobeLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.686 15c-.556 2.63-1.832 5.053-3.686 7C6.667 16.4 6.667 7.6 12 2 6.87 2.001 2.573 5.884 2.054 10.988c-.519 5.104 2.908 9.772 7.932 10.807C15.011 22.829 20.003 19.894 21.542 15")
            addPathData("M2 12h8.5")
            addPathData("M20 6v-2C20 2.895 19.105 2 18 2c-1.105 0-2 .895-2 2v2")
            addPathData("M15 6h6c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-6c-.552 0-1-.448-1-1v-3c0-.552 .448-1 1-1Z")
        }
        return _globeLock!!
    }

private var _globeLock: ImageVector? = null
