package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SearchCode: ImageVector
    get() {
        if (_searchCode != null) return _searchCode!!
        _searchCode = lucideOutlineIcon(
            name = "SearchCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 13.5 15 11 13 8.5")
            addPathData("M21 21 16.7 16.7")
            addPathData("M9 8.5 7 11l2 2.5")
            addPathData("M19 11c0 4.418-3.582 8-8 8C6.582 19 3 15.418 3 11 3 6.582 6.582 3 11 3c4.418 0 8 3.582 8 8Z")
        }
        return _searchCode!!
    }

private var _searchCode: ImageVector? = null
