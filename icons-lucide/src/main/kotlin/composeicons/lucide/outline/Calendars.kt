package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Calendars: ImageVector
    get() {
        if (_calendars != null) return _calendars!!
        _calendars = lucideOutlineIcon(
            name = "Calendars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2v2")
            addPathData("M15.726 21.01c-.359 .613-1.016 .99-1.726 .99h-10C2.895 22 2 21.105 2 20v-10C2 8.895 2.895 8 4 8")
            addPathData("M18 2v2")
            addPathData("M2 13h2")
            addPathData("M8 8h14")
            addPathData("M10 3h10c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-10C8.895 17 8 16.105 8 15v-10C8 3.895 8.895 3 10 3Z")
        }
        return _calendars!!
    }

private var _calendars: ImageVector? = null
