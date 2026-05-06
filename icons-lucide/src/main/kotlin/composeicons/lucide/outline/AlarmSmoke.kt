package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlarmSmoke: ImageVector
    get() {
        if (_alarmSmoke != null) return _alarmSmoke!!
        _alarmSmoke = lucideOutlineIcon(
            name = "AlarmSmoke",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 21c0-2.5 2-2.5 2-5")
            addPathData("M16 21c0-2.5 2-2.5 2-5")
            addPathData("M19 8l-.8 3c-.117 .573-.615 .988-1.2 1h-10C6.415 11.988 5.917 11.573 5.8 11L5 8")
            addPathData("M21 3c.552 0 1 .448 1 1v2c0 1.105-.895 2-2 2h-16C2.895 8 2 7.105 2 6v-2C2 3.448 2.448 3 3 3Z")
            addPathData("M6 21C6 18.5 8 18.5 8 16")
        }
        return _alarmSmoke!!
    }

private var _alarmSmoke: ImageVector? = null
