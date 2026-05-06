package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlarmClockOff: ImageVector
    get() {
        if (_alarmClockOff != null) return _alarmClockOff!!
        _alarmClockOff = lucideOutlineIcon(
            name = "AlarmClockOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.87 6.87C4.518 8.803 3.467 11.904 4.159 14.869c.692 2.965 3.007 5.28 5.972 5.972 2.965 .692 6.066-.359 7.999-2.711")
            addPathData("M19.9 14.25c.399-2.528-.435-5.095-2.245-6.905C15.845 5.535 13.278 4.701 10.75 5.1")
            addPathData("M22 6 19 3")
            addPathData("M6.26 18.67 4 21")
            addPathData("M2 2 22 22")
            addPathData("M4 4 2 6")
        }
        return _alarmClockOff!!
    }

private var _alarmClockOff: ImageVector? = null
