package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Logs: ImageVector
    get() {
        if (_logs != null) return _logs!!
        _logs = lucideOutlineIcon(
            name = "Logs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5h1")
            addPathData("M3 12h1")
            addPathData("M3 19h1")
            addPathData("M8 5h1")
            addPathData("M8 12h1")
            addPathData("M8 19h1")
            addPathData("M13 5h8")
            addPathData("M13 12h8")
            addPathData("M13 19h8")
        }
        return _logs!!
    }

private var _logs: ImageVector? = null
