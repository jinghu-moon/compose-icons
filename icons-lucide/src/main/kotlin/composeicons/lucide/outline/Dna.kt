package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Dna: ImageVector
    get() {
        if (_dna != null) return _dna!!
        _dna = lucideOutlineIcon(
            name = "Dna",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 16l1.5 1.5")
            addPathData("M14 8 12.5 6.5")
            addPathData("M15 2C13.202 3.998 12.482 5.995 12.193 7.993")
            addPathData("M16.5 10.5l1 1")
            addPathData("M17 6 14.109 3.109")
            addPathData("M2 15C8.667 9 15.333 15 22 9")
            addPathData("M20 9l.891 .891")
            addPathData("M3.109 14.109 4 15")
            addPathData("M6.5 12.5l1 1")
            addPathData("M7 18l2.891 2.891")
            addPathData("M9 22c1.798-1.998 2.518-3.995 2.807-5.993")
        }
        return _dna!!
    }

private var _dna: ImageVector? = null
