package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Newspaper: ImageVector
    get() {
        if (_newspaper != null) return _newspaper!!
        _newspaper = lucideOutlineIcon(
            name = "Newspaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 18h-5")
            addPathData("M18 14h-8")
            addPathData("M4 22h16c1.105 0 2-.895 2-2v-16C22 2.895 21.105 2 20 2h-12C6.895 2 6 2.895 6 4v16c0 1.105-.895 2-2 2C2.895 22 2 21.105 2 20v-9C2 9.895 2.895 9 4 9h2")
            addPathData("M11 6h6c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-6c-.552 0-1-.448-1-1v-2c0-.552 .448-1 1-1Z")
        }
        return _newspaper!!
    }

private var _newspaper: ImageVector? = null
