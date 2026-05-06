package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Calendar: ImageVector
    get() {
        if (_calendar != null) return _calendar!!
        _calendar = lucideOutlineIcon(
            name = "Calendar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 2v4")
            addPathData("M16 2v4")
            addPathData("M5 4h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 22 3 21.105 3 20v-14C3 4.895 3.895 4 5 4Z")
            addPathData("M3 10h18")
        }
        return _calendar!!
    }

private var _calendar: ImageVector? = null
