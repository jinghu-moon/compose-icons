package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Gavel: ImageVector
    get() {
        if (_gavel != null) return _gavel!!
        _gavel = lucideOutlineIcon(
            name = "Gavel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 13 5.619 21.38c-.828 .829-2.172 .829-3 .001-.829-.828-.829-2.172-0-3.001L11.002 9.999")
            addPathData("M16 16l6-6")
            addPathData("M21.5 10.5l-8-8")
            addPathData("M8 8 14 2")
            addPathData("M8.5 7.5l8 8")
        }
        return _gavel!!
    }

private var _gavel: ImageVector? = null
