package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlarmClockPlus: ImageVector
    get() {
        if (_alarmClockPlus != null) return _alarmClockPlus!!
        _alarmClockPlus = lucideOutlineIcon(
            name = "AlarmClockPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 13c0 4.418-3.582 8-8 8C7.582 21 4 17.418 4 13 4 8.582 7.582 5 12 5c4.418 0 8 3.582 8 8Z")
            addPathData("M5 3 2 6")
            addPathData("M22 6 19 3")
            addPathData("M6.38 18.7 4 21")
            addPathData("M17.64 18.67 20 21")
            addPathData("M12 10v6")
            addPathData("M9 13h6")
        }
        return _alarmClockPlus!!
    }

private var _alarmClockPlus: ImageVector? = null
