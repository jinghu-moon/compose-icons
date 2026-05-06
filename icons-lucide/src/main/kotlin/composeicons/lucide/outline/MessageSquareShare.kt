package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MessageSquareShare: ImageVector
    get() {
        if (_messageSquareShare != null) return _messageSquareShare!!
        _messageSquareShare = lucideOutlineIcon(
            name = "MessageSquareShare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3h-8C2.895 3 2 3.895 2 5v16.286c0 .287 .173 .546 .438 .656 .265 .11 .571 .049 .774-.154L5.414 19.586c.375-.375 .884-.586 1.414-.586h13.172c1.105 0 2-.895 2-2v-4")
            addPathData("M16 3h6v6")
            addPathData("M16 9 22 3")
        }
        return _messageSquareShare!!
    }

private var _messageSquareShare: ImageVector? = null
