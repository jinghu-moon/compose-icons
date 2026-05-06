package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZodiacCapricorn: ImageVector
    get() {
        if (_zodiacCapricorn != null) return _zodiacCapricorn!!
        _zodiacCapricorn = lucideOutlineIcon(
            name = "ZodiacCapricorn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 21c1.657 0 3-1.343 3-3v-11.5C14 4.567 12.433 3 10.5 3 8.567 3 7 4.567 7 6.5")
            addPathData("M7 19v-13C7 4.343 5.657 3 4 3h0")
            addPathData("M20 17c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3Z")
        }
        return _zodiacCapricorn!!
    }

private var _zodiacCapricorn: ImageVector? = null
