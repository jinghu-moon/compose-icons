package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MessageSquareWarning: ImageVector
    get() {
        if (_messageSquareWarning != null) return _messageSquareWarning!!
        _messageSquareWarning = lucideOutlineIcon(
            name = "MessageSquareWarning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 17c0 1.105-.895 2-2 2h-13.172c-.53 0-1.039 .211-1.414 .586L3.212 21.788c-.203 .203-.508 .264-.774 .154C2.173 21.832 2 21.573 2 21.286v-16.286C2 3.895 2.895 3 4 3h16c1.105 0 2 .895 2 2Z")
            addPathData("M12 15h.01")
            addPathData("M12 7v4")
        }
        return _messageSquareWarning!!
    }

private var _messageSquareWarning: ImageVector? = null
