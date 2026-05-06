package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Watch: ImageVector
    get() {
        if (_watch != null) return _watch!!
        _watch = lucideOutlineIcon(
            name = "Watch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 10v2.2l1.6 1")
            addPathData("M16.13 7.66 15.32 3.61C15.131 2.66 14.289 1.981 13.32 2h-2.68c-.969-.019-1.811 .66-2 1.61L7.86 7.66")
            addPathData("M7.88 16.36l.8 4c.189 .95 1.031 1.629 2 1.61h2.72c.969 .019 1.811-.66 2-1.61l.81-4.05")
            addPathData("M18 12c0 3.314-2.686 6-6 6C8.686 18 6 15.314 6 12 6 8.686 8.686 6 12 6c3.314 0 6 2.686 6 6Z")
        }
        return _watch!!
    }

private var _watch: ImageVector? = null
