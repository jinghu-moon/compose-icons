package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BotMessageSquare: ImageVector
    get() {
        if (_botMessageSquare != null) return _botMessageSquare!!
        _botMessageSquare = lucideOutlineIcon(
            name = "BotMessageSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 6v-4h-4")
            addPathData("M15 11v2")
            addPathData("M2 12h2")
            addPathData("M20 12h2")
            addPathData("M20 16c0 1.105-.895 2-2 2h-9.172c-.53 0-1.039 .211-1.414 .586L5.212 20.788c-.203 .203-.508 .264-.774 .154C4.173 20.832 4 20.573 4 20.286v-12.286C4 6.895 4.895 6 6 6h12c1.105 0 2 .895 2 2Z")
            addPathData("M9 11v2")
        }
        return _botMessageSquare!!
    }

private var _botMessageSquare: ImageVector? = null
