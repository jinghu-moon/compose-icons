package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.WholeWord: ImageVector
    get() {
        if (_wholeWord != null) return _wholeWord!!
        _wholeWord = lucideOutlineIcon(
            name = "WholeWord",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12c0 1.657-1.343 3-3 3C5.343 15 4 13.657 4 12 4 10.343 5.343 9 7 9c1.657 0 3 1.343 3 3Z")
            addPathData("M10 9v6")
            addPathData("M20 12c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3Z")
            addPathData("M14 7v8")
            addPathData("M22 17v1c0 .5-.5 1-1 1h-18C2.5 19 2 18.5 2 18v-1")
        }
        return _wholeWord!!
    }

private var _wholeWord: ImageVector? = null
