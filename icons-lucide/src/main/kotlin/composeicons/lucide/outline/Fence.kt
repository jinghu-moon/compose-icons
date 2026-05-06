package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Fence: ImageVector
    get() {
        if (_fence != null) return _fence!!
        _fence = lucideOutlineIcon(
            name = "Fence",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 3 2 5v15c0 .6 .4 1 1 1h2c.6 0 1-.4 1-1v-15Z")
            addPathData("M6 8h4")
            addPathData("M6 18h4")
            addPathData("M12 3 10 5v15c0 .6 .4 1 1 1h2c.6 0 1-.4 1-1v-15Z")
            addPathData("M14 8h4")
            addPathData("M14 18h4")
            addPathData("M20 3 18 5v15c0 .6 .4 1 1 1h2c.6 0 1-.4 1-1v-15Z")
        }
        return _fence!!
    }

private var _fence: ImageVector? = null
