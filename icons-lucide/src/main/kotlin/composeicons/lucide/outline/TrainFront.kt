package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TrainFront: ImageVector
    get() {
        if (_trainFront != null) return _trainFront!!
        _trainFront = lucideOutlineIcon(
            name = "TrainFront",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 3.1v3.9c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-3.9")
            addPathData("M9 15 8 14")
            addPathData("M15 15l1-1")
            addPathData("M9 19C6.2 19 4 16.8 4 14v-4C4 5.582 7.582 2 12 2c4.418 0 8 3.582 8 8v4c0 2.8-2.2 5-5 5Z")
            addPathData("M8 19 6 22")
            addPathData("M16 19l2 3")
        }
        return _trainFront!!
    }

private var _trainFront: ImageVector? = null
