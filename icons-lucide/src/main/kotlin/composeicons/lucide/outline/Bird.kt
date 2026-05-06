package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Bird: ImageVector
    get() {
        if (_bird != null) return _bird!!
        _bird = lucideOutlineIcon(
            name = "Bird",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 7h.01")
            addPathData("M3.4 18h8.6c4.418 0 8-3.582 8-8v-3C20.005 5.251 18.873 3.702 17.205 3.175c-1.668-.527-3.484 .091-4.485 1.525L2 20")
            addPathData("M20 7l2 .5L20 8")
            addPathData("M10 18v3")
            addPathData("M14 17.75v3.25")
            addPathData("M7 18c2.526-0 4.782-1.583 5.642-3.958 .86-2.375 .139-5.035-1.802-6.652")
        }
        return _bird!!
    }

private var _bird: ImageVector? = null
