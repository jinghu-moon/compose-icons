package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Boxes: ImageVector
    get() {
        if (_boxes != null) return _boxes!!
        _boxes = lucideOutlineIcon(
            name = "Boxes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2.97 12.92c-.601 .361-.968 1.009-.97 1.71v3.24c.002 .701 .369 1.349 .97 1.71l3 1.8c.634 .381 1.426 .381 2.06 0L12 19v-5.5l-5-3L2.97 12.92Z")
            addPathData("M7 16.5 2.26 13.65")
            addPathData("M7 16.5l5-3")
            addPathData("M7 16.5v5.17")
            addPathData("M12 13.5v5.5l3.97 2.38c.634 .381 1.426 .381 2.06 0l3-1.8c.601-.361 .968-1.009 .97-1.71v-3.24c-.002-.701-.369-1.349-.97-1.71L17 10.5l-5 3Z")
            addPathData("M17 16.5l-5-3")
            addPathData("M17 16.5l4.74-2.85")
            addPathData("M17 16.5v5.17")
            addPathData("M7.97 4.42C7.369 4.781 7.002 5.429 7 6.13v4.37l5 3 5-3v-4.37c-.002-.701-.369-1.349-.97-1.71L13.03 2.62c-.634-.381-1.426-.381-2.06 0L7.97 4.42Z")
            addPathData("M12 8 7.26 5.15")
            addPathData("M12 8 16.74 5.15")
            addPathData("M12 13.5v-5.5")
        }
        return _boxes!!
    }

private var _boxes: ImageVector? = null
