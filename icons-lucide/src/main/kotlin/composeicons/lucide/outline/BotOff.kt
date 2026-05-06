package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BotOff: ImageVector
    get() {
        if (_botOff != null) return _botOff!!
        _botOff = lucideOutlineIcon(
            name = "BotOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.67 8h4.33c1.105 0 2 .895 2 2v4.33")
            addPathData("M2 14h2")
            addPathData("M20 14h2")
            addPathData("M22 22 2 2")
            addPathData("M8 8h-2C4.895 8 4 8.895 4 10v8c0 1.105 .895 2 2 2h12c.53-0 1.039-.211 1.414-.586")
            addPathData("M9 13v2")
            addPathData("M9.67 4h2.33v2.33")
        }
        return _botOff!!
    }

private var _botOff: ImageVector? = null
