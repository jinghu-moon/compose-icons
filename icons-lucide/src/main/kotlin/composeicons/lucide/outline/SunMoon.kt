package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SunMoon: ImageVector
    get() {
        if (_sunMoon != null) return _sunMoon!!
        _sunMoon = lucideOutlineIcon(
            name = "SunMoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2v2")
            addPathData("M14.837 16.385c-.682 2.876-3.356 4.827-6.303 4.598C5.587 20.754 3.246 18.413 3.017 15.467 2.788 12.52 4.738 9.845 7.614 9.163c.624-.147 .97 .66 .715 1.248-.651 1.506-.317 3.257 .843 4.417 1.16 1.16 2.911 1.494 4.417 .842 .589-.255 1.396 .09 1.248 .715")
            addPathData("M16 12C16 9.791 14.209 8 12 8")
            addPathData("M19 5 17.744 6.256")
            addPathData("M20 12h2")
        }
        return _sunMoon!!
    }

private var _sunMoon: ImageVector? = null
