package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GitGraph: ImageVector
    get() {
        if (_gitGraph != null) return _gitGraph!!
        _gitGraph = lucideOutlineIcon(
            name = "GitGraph",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 6C8 7.657 6.657 9 5 9 3.343 9 2 7.657 2 6 2 4.343 3.343 3 5 3 6.657 3 8 4.343 8 6Z")
            addPathData("M5 9v6")
            addPathData("M8 18c0 1.657-1.343 3-3 3C3.343 21 2 19.657 2 18 2 16.343 3.343 15 5 15c1.657 0 3 1.343 3 3Z")
            addPathData("M12 3v18")
            addPathData("M22 6c0 1.657-1.343 3-3 3C17.343 9 16 7.657 16 6 16 4.343 17.343 3 19 3c1.657 0 3 1.343 3 3Z")
            addPathData("M16 15.7C17.907 13.995 18.998 11.558 19 9")
        }
        return _gitGraph!!
    }

private var _gitGraph: ImageVector? = null
