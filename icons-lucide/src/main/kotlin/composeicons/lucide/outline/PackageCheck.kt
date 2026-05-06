package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PackageCheck: ImageVector
    get() {
        if (_packageCheck != null) return _packageCheck!!
        _packageCheck = lucideOutlineIcon(
            name = "PackageCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 22v-10")
            addPathData("M16 17l2 2 4-4")
            addPathData("M21 11.127v-3.127C20.999 7.286 20.618 6.627 20 6.27l-7-4c-.619-.357-1.381-.357-2 0l-7 4C3.382 6.627 3.001 7.286 3 8v8c.001 .713 .382 1.372 1 1.729l7 4c.619 .358 1.381 .358 2 .001l1.32-.753")
            addPathData("M3.29 7 12 12 20.71 7")
            addPathData("M7.5 4.27l8.997 5.148")
        }
        return _packageCheck!!
    }

private var _packageCheck: ImageVector? = null
