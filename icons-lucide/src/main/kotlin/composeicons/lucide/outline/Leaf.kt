package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Leaf: ImageVector
    get() {
        if (_leaf != null) return _leaf!!
        _leaf = lucideOutlineIcon(
            name = "Leaf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 20C7.359 20.011 4.318 17.229 4.005 13.602 3.692 9.975 6.211 6.713 9.8 6.1 15.5 5 17 4.48 19 2c1 2 2 4.18 2 8 0 5.5-4.78 10-10 10Z")
            addPathData("M2 21C2 18 3.85 15.64 7.08 15 9.5 14.52 12 13 13 12")
        }
        return _leaf!!
    }

private var _leaf: ImageVector? = null
