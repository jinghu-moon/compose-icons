package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FlipHorizontal2: ImageVector
    get() {
        if (_flipHorizontal2 != null) return _flipHorizontal2!!
        _flipHorizontal2 = lucideOutlineIcon(
            name = "FlipHorizontal2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7l5 5L3 17v-10")
            addPathData("M21 7l-5 5 5 5v-10")
            addPathData("M12 20v2")
            addPathData("M12 14v2")
            addPathData("M12 8v2")
            addPathData("M12 2v2")
        }
        return _flipHorizontal2!!
    }

private var _flipHorizontal2: ImageVector? = null
