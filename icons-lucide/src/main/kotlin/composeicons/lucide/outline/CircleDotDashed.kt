package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CircleDotDashed: ImageVector
    get() {
        if (_circleDotDashed != null) return _circleDotDashed!!
        _circleDotDashed = lucideOutlineIcon(
            name = "CircleDotDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.1 2.18c1.255-.245 2.545-.245 3.8 0")
            addPathData("M17.6 3.71c1.062 .718 1.976 1.635 2.69 2.7")
            addPathData("M21.82 10.1c.245 1.255 .245 2.545 0 3.8")
            addPathData("M20.29 17.6c-.718 1.062-1.635 1.976-2.7 2.69")
            addPathData("M13.9 21.82c-1.255 .244-2.545 .244-3.8 0")
            addPathData("M6.4 20.29C5.338 19.572 4.424 18.655 3.71 17.59")
            addPathData("M2.18 13.9c-.245-1.255-.245-2.545 0-3.8")
            addPathData("M3.71 6.4C4.428 5.338 5.345 4.424 6.41 3.71")
            addPathData("M13 12c0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
        }
        return _circleDotDashed!!
    }

private var _circleDotDashed: ImageVector? = null
