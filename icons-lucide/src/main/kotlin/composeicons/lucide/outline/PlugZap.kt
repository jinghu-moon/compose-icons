package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PlugZap: ImageVector
    get() {
        if (_plugZap != null) return _plugZap!!
        _plugZap = lucideOutlineIcon(
            name = "PlugZap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.3 20.3c.45 .452 1.062 .706 1.7 .706 .638 0 1.25-.254 1.7-.706L12 18 6 12 3.7 14.3c-.452 .45-.706 1.062-.706 1.7 0 .638 .254 1.25 .706 1.7Z")
            addPathData("M2 22 5 19")
            addPathData("M7.5 13.5 10 11")
            addPathData("M10.5 16.5 13 14")
            addPathData("M18 3 14 7h6l-4 4")
        }
        return _plugZap!!
    }

private var _plugZap: ImageVector? = null
