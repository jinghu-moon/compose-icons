package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SunMedium: ImageVector
    get() {
        if (_sunMedium != null) return _sunMedium!!
        _sunMedium = lucideOutlineIcon(
            name = "SunMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 12c0 2.209-1.791 4-4 4C9.791 16 8 14.209 8 12 8 9.791 9.791 8 12 8c2.209 0 4 1.791 4 4Z")
            addPathData("M12 3v1")
            addPathData("M12 20v1")
            addPathData("M3 12h1")
            addPathData("M20 12h1")
            addPathData("M18.364 5.636l-.707 .707")
            addPathData("M6.343 17.657l-.707 .707")
            addPathData("M5.636 5.636l.707 .707")
            addPathData("M17.657 17.657l.707 .707")
        }
        return _sunMedium!!
    }

private var _sunMedium: ImageVector? = null
