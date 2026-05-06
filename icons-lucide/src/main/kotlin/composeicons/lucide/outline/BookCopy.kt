package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BookCopy: ImageVector
    get() {
        if (_bookCopy != null) return _bookCopy!!
        _bookCopy = lucideOutlineIcon(
            name = "BookCopy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 7C3.895 7 3 7.895 3 9v11")
            addPathData("M5.803 18h-.803c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2h9.5c.276 0 .5-.224 .5-.5v-.5")
            addPathData("M9 15v-11C9 2.895 9.895 2 11 2h9.5c.276 0 .5 .224 .5 .5v14c0 .276-.224 .5-.5 .5h-9.5C9.895 17 9 16.105 9 15c0-1.105 .895-2 2-2h10")
        }
        return _bookCopy!!
    }

private var _bookCopy: ImageVector? = null
