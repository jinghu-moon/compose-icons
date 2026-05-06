package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TimerOff: ImageVector
    get() {
        if (_timerOff != null) return _timerOff!!
        _timerOff = lucideOutlineIcon(
            name = "TimerOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 2h4")
            addPathData("M4.6 11c-1.239 2.978-.568 6.408 1.7 8.7 2.292 2.268 5.722 2.939 8.7 1.7")
            addPathData("M7.4 7.4c3.216-2.231 7.574-1.808 10.3 1 2.722 2.738 3.1 7.028 .9 10.2")
            addPathData("M2 2 22 22")
            addPathData("M12 12v-2")
        }
        return _timerOff!!
    }

private var _timerOff: ImageVector? = null
