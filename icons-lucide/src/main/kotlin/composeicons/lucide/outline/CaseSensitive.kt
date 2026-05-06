package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CaseSensitive: ImageVector
    get() {
        if (_caseSensitive != null) return _caseSensitive!!
        _caseSensitive = lucideOutlineIcon(
            name = "CaseSensitive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 16 6.039 6.31c.078-.186 .26-.308 .462-.308 .202 0 .384 .121 .461 .308L11 16")
            addPathData("M22 9v7")
            addPathData("M3.304 13h6.392")
            addPathData("M22 12.5C22 14.433 20.433 16 18.5 16 16.567 16 15 14.433 15 12.5 15 10.567 16.567 9 18.5 9 20.433 9 22 10.567 22 12.5Z")
        }
        return _caseSensitive!!
    }

private var _caseSensitive: ImageVector? = null
