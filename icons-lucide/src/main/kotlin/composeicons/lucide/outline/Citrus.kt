package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Citrus: ImageVector
    get() {
        if (_citrus != null) return _citrus!!
        _citrus = lucideOutlineIcon(
            name = "Citrus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21.66 17.67c.221 .21 .342 .504 .335 .809-.008 .305-.144 .592-.375 .791C16.849 23.191 9.882 22.851 5.516 18.484 1.149 14.118 .809 7.151 4.73 2.38c.202-.229 .491-.363 .796-.371 .305-.008 .6 .112 .814 .331Z")
            addPathData("M19.65 15.66c-3.148 2.986-8.102 2.918-11.167-.153C5.418 12.437 5.359 7.483 8.35 4.34")
            addPathData("M14 10 8.5 15.5")
            addPathData("M14 17.85v-7.85h-7.85")
        }
        return _citrus!!
    }

private var _citrus: ImageVector? = null
