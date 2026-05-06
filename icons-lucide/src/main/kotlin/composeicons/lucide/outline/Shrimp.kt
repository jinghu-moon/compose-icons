package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Shrimp: ImageVector
    get() {
        if (_shrimp != null) return _shrimp!!
        _shrimp = lucideOutlineIcon(
            name = "Shrimp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 12h.01")
            addPathData("M13 22c.5-.5 1.12-1 2.5-1-1.38 0-2-.5-2.5-1")
            addPathData("M14 2c-.604 1.206-1.884 1.919-3.227 1.798L4.603 3.237C3.725 3.153 2.873 3.559 2.385 4.293c-.487 .735-.53 1.678-.111 2.454C2.693 7.523 3.505 8.005 4.387 8h11.113C19.09 8 22 10.91 22 14.5 22 18.09 19.09 21 15.5 21 16.881 21 18 19.881 18 18.5 18 17.119 16.881 16 15.5 16h-3.5C8.134 16 5 12.866 5 9v-1")
            addPathData("M14 8c1.333 2.5 1.333 5.5 0 8")
            addPathData("M16 16c2 0 4.5-4 4-6")
        }
        return _shrimp!!
    }

private var _shrimp: ImageVector? = null
