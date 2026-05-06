package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Server: ImageVector
    get() {
        if (_server != null) return _server!!
        _server = lucideOutlineIcon(
            name = "Server",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 2h16c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-16C2.895 10 2 9.105 2 8v-4C2 2.895 2.895 2 4 2Z")
            addPathData("M4 14h16c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-16C2.895 22 2 21.105 2 20v-4c0-1.105 .895-2 2-2Z")
            addPathData("M6 6h.01")
            addPathData("M6 18h.01")
        }
        return _server!!
    }

private var _server: ImageVector? = null
