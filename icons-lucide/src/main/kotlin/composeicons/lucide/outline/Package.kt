package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Package: ImageVector
    get() {
        if (_package != null) return _package!!
        _package = lucideOutlineIcon(
            name = "Package",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 21.73c.619 .357 1.381 .357 2 0l7-4c.618-.357 .999-1.016 1-1.73v-8C20.999 7.286 20.618 6.627 20 6.27l-7-4c-.619-.357-1.381-.357-2 0l-7 4C3.382 6.627 3.001 7.286 3 8v8c.001 .714 .382 1.373 1 1.73Z")
            addPathData("M12 22v-10")
            addPathData("M3.29 7 12 12 20.71 7")
            addPathData("M7.5 4.27l9 5.15")
        }
        return _package!!
    }

private var _package: ImageVector? = null
