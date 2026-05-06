package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MessagesSquare: ImageVector
    get() {
        if (_messagesSquare != null) return _messagesSquare!!
        _messagesSquare = lucideOutlineIcon(
            name = "MessagesSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 10c0 1.105-.895 2-2 2h-7.172c-.53 0-1.039 .211-1.414 .586L3.212 14.788c-.203 .203-.508 .264-.774 .154C2.173 14.832 2 14.573 2 14.286v-10.286C2 2.895 2.895 2 4 2h10c1.105 0 2 .895 2 2Z")
            addPathData("M20 9c1.105 0 2 .895 2 2v10.286c-0 .287-.173 .546-.438 .656-.265 .11-.571 .049-.774-.154L18.586 19.586c-.375-.375-.884-.586-1.414-.586h-7.172C8.895 19 8 18.105 8 17v-1")
        }
        return _messagesSquare!!
    }

private var _messagesSquare: ImageVector? = null
