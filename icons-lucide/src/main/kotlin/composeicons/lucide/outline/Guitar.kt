package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Guitar: ImageVector
    get() {
        if (_guitar != null) return _guitar!!
        _guitar = lucideOutlineIcon(
            name = "Guitar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.9 12.1 16.414 7.586")
            addPathData("M20.1 2.3c-.389-.381-1.011-.381-1.4 0L17.586 3.414c-.375 .375-.586 .884-.586 1.414v1.344c-0 .53-.211 1.039-.586 1.414 .375-.375 .884-.586 1.414-.586h1.344c.53-0 1.039-.211 1.414-.586L21.7 5.3c.381-.389 .381-1.011 0-1.4Z")
            addPathData("M6 16l2 2")
            addPathData("M8.23 9.85C8.695 8.73 9.788 8 11 8c2.761 0 5 2.239 5 5-0 1.212-.73 2.305-1.85 2.77l-.92 .38C12.484 16.461 11.998 17.191 12 18c0 2.209-1.791 4-4 4C4.686 22 2 19.314 2 16 2 13.791 3.791 12 6 12c.809 .002 1.539-.484 1.85-1.23Z")
        }
        return _guitar!!
    }

private var _guitar: ImageVector? = null
