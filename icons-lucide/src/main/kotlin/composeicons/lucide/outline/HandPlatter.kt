package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HandPlatter: ImageVector
    get() {
        if (_handPlatter != null) return _handPlatter!!
        _handPlatter = lucideOutlineIcon(
            name = "HandPlatter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3v-1")
            addPathData("M15.4 17.4l3.2-2.8c.801-.773 2.077-.751 2.85 .05 .773 .801 .751 2.077-.05 2.85l-3.6 3.3C17.1 21.6 16.1 22 15 22h-4C9.9 22 8.9 21.6 8.2 20.8L6.898 19.336C6.708 19.122 6.437 19 6.151 19h-1.151")
            addPathData("M2 14h12c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-2")
            addPathData("M4 10h16")
            addPathData("M5 10C5 6.134 8.134 3 12 3c3.866 0 7 3.134 7 7")
            addPathData("M5 14v6c0 .552-.448 1-1 1h-2")
        }
        return _handPlatter!!
    }

private var _handPlatter: ImageVector? = null
