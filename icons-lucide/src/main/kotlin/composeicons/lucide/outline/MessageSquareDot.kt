package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MessageSquareDot: ImageVector
    get() {
        if (_messageSquareDot != null) return _messageSquareDot!!
        _messageSquareDot = lucideOutlineIcon(
            name = "MessageSquareDot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.7 3h-8.7C2.895 3 2 3.895 2 5v16.286c0 .287 .173 .546 .438 .656 .265 .11 .571 .049 .774-.154L5.414 19.586c.375-.375 .884-.586 1.414-.586h13.172c1.105 0 2-.895 2-2v-4.7")
            addPathData("M22 6c0 1.657-1.343 3-3 3C17.343 9 16 7.657 16 6 16 4.343 17.343 3 19 3c1.657 0 3 1.343 3 3Z")
        }
        return _messageSquareDot!!
    }

private var _messageSquareDot: ImageVector? = null
