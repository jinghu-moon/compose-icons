package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HatGlasses: ImageVector
    get() {
        if (_hatGlasses != null) return _hatGlasses!!
        _hatGlasses = lucideOutlineIcon(
            name = "HatGlasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 18c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M19 11 16.89 4.343c-.187-.538-.594-.97-1.119-1.189-.525-.219-1.119-.204-1.633 .041l-1.276 .61C12.593 3.933 12.298 4 12 4h-3.5C7.605 4 6.818 4.595 6.575 5.456L5 11")
            addPathData("M2 11h20")
            addPathData("M20 18c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3Z")
            addPathData("M10 18c0 1.657-1.343 3-3 3C5.343 21 4 19.657 4 18 4 16.343 5.343 15 7 15c1.657 0 3 1.343 3 3Z")
        }
        return _hatGlasses!!
    }

private var _hatGlasses: ImageVector? = null
