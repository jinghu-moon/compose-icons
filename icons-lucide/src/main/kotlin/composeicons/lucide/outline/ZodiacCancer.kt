package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZodiacCancer: ImageVector
    get() {
        if (_zodiacCancer != null) return _zodiacCancer!!
        _zodiacCancer = lucideOutlineIcon(
            name = "ZodiacCancer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 14.5c.002 2.655-2.232 5.045-5.643 6.035C11.945 21.526 8.043 20.918 5.5 19")
            addPathData("M3 9.5C2.998 6.845 5.232 4.455 8.643 3.465 12.055 2.474 15.957 3.082 18.5 5")
            addPathData("M21 14.5C21 16.433 19.433 18 17.5 18 15.567 18 14 16.433 14 14.5 14 12.567 15.567 11 17.5 11 19.433 11 21 12.567 21 14.5Z")
            addPathData("M10 9.5C10 11.433 8.433 13 6.5 13 4.567 13 3 11.433 3 9.5 3 7.567 4.567 6 6.5 6 8.433 6 10 7.567 10 9.5Z")
        }
        return _zodiacCancer!!
    }

private var _zodiacCancer: ImageVector? = null
