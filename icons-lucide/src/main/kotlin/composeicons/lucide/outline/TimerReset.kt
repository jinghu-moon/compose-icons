package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TimerReset: ImageVector
    get() {
        if (_timerReset != null) return _timerReset!!
        _timerReset = lucideOutlineIcon(
            name = "TimerReset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 2h4")
            addPathData("M12 14v-4")
            addPathData("M4 13C4.507 8.976 7.944 5.968 12 6c3.558 .004 6.686 2.357 7.676 5.774 .99 3.417-.396 7.078-3.401 8.983C13.27 22.662 9.368 22.353 6.7 20L4 17.6")
            addPathData("M9 17h-5v5")
        }
        return _timerReset!!
    }

private var _timerReset: ImageVector? = null
