package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MessageSquareLock: ImageVector
    get() {
        if (_messageSquareLock != null) return _messageSquareLock!!
        _messageSquareLock = lucideOutlineIcon(
            name = "MessageSquareLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 8.5v-3.5C22 3.895 21.105 3 20 3h-16C2.895 3 2 3.895 2 5v16.286c0 .287 .173 .546 .438 .656 .265 .11 .571 .049 .774-.154L5.414 19.586c.375-.375 .884-.586 1.414-.586h3.172")
            addPathData("M20 15v-2c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2v2")
            addPathData("M15 15h6c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-6c-.552 0-1-.448-1-1v-3c0-.552 .448-1 1-1Z")
        }
        return _messageSquareLock!!
    }

private var _messageSquareLock: ImageVector? = null
