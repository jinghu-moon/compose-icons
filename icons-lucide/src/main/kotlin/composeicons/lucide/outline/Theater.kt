package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Theater: ImageVector
    get() {
        if (_theater != null) return _theater!!
        _theater = lucideOutlineIcon(
            name = "Theater",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 10C2 10 5 7 5 2")
            addPathData("M22 10C22 10 19 7 19 2")
            addPathData("M10 2c0 4.4-3.6 8-8 8")
            addPathData("M14 2c0 4.4 3.6 8 8 8")
            addPathData("M2 10c0 0 2 2 2 5")
            addPathData("M22 10c0 0-2 2-2 5")
            addPathData("M8 15h8")
            addPathData("M2 22v-1c0-1.105 .895-2 2-2h4c1.105 0 2 .895 2 2v1")
            addPathData("M14 22v-1c0-1.105 .895-2 2-2h4c1.105 0 2 .895 2 2v1")
        }
        return _theater!!
    }

private var _theater: ImageVector? = null
