package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Film: ImageVector
    get() {
        if (_film != null) return _film!!
        _film = lucideOutlineIcon(
            name = "Film",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14C3 3.895 3.895 3 5 3Z")
            addPathData("M7 3v18")
            addPathData("M3 7.5h4")
            addPathData("M3 12h18")
            addPathData("M3 16.5h4")
            addPathData("M17 3v18")
            addPathData("M17 7.5h4")
            addPathData("M17 16.5h4")
        }
        return _film!!
    }

private var _film: ImageVector? = null
