package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Panda: ImageVector
    get() {
        if (_panda != null) return _panda!!
        _panda = lucideOutlineIcon(
            name = "Panda",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.25 17.25h1.5L12 18Z")
            addPathData("M15 12l2 2")
            addPathData("M18 6.5C18 6.224 17.776 6 17.5 6")
            addPathData("M20.69 9.67C21.918 8.44 22.328 6.612 21.743 4.975 21.157 3.338 19.681 2.185 17.951 2.013c-1.73-.172-3.404 .668-4.301 2.157-1.089-.22-2.211-.22-3.3 0C9.453 2.68 7.779 1.841 6.049 2.013 4.319 2.185 2.843 3.338 2.257 4.975 1.672 6.612 2.082 8.44 3.31 9.67 2.49 11.2 2 12.88 2 14.5 2 19.47 6.48 22 12 22c5.52 0 10-2.53 10-7.5 0-1.62-.48-3.3-1.3-4.83")
            addPathData("M6 6.5c-.001-.133 .051-.261 .145-.355C6.239 6.051 6.367 5.999 6.5 6")
            addPathData("M9 12 7 14")
        }
        return _panda!!
    }

private var _panda: ImageVector? = null
