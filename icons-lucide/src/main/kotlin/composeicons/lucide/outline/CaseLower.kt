package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CaseLower: ImageVector
    get() {
        if (_caseLower != null) return _caseLower!!
        _caseLower = lucideOutlineIcon(
            name = "CaseLower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 9v7")
            addPathData("M14 6v10")
            addPathData("M21 12.5C21 14.433 19.433 16 17.5 16 15.567 16 14 14.433 14 12.5 14 10.567 15.567 9 17.5 9 19.433 9 21 10.567 21 12.5Z")
            addPathData("M10 12.5C10 14.433 8.433 16 6.5 16 4.567 16 3 14.433 3 12.5 3 10.567 4.567 9 6.5 9 8.433 9 10 10.567 10 12.5Z")
        }
        return _caseLower!!
    }

private var _caseLower: ImageVector? = null
