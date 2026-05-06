package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.DnaOff: ImageVector
    get() {
        if (_dnaOff != null) return _dnaOff!!
        _dnaOff = lucideOutlineIcon(
            name = "DnaOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 2C13.65 3.5 12.908 5 12.5 6.5L14 8")
            addPathData("M17 6 14.109 3.109")
            addPathData("M2 15C5.333 12 8.667 12 12 12")
            addPathData("M2 2 22 22")
            addPathData("M20 9l.891 .891")
            addPathData("M22 9c-1.5 1.35-3 2.092-4.5 2.5l-1-1")
            addPathData("M3.109 14.109 4 15")
            addPathData("M6.5 12.5l1 1")
            addPathData("M7 18l2.891 2.891")
            addPathData("M9 22c1.35-1.5 2.092-3 2.5-4.5L10 16")
        }
        return _dnaOff!!
    }

private var _dnaOff: ImageVector? = null
