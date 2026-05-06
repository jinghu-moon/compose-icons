package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MessageSquareHeart: ImageVector
    get() {
        if (_messageSquareHeart != null) return _messageSquareHeart!!
        _messageSquareHeart = lucideOutlineIcon(
            name = "MessageSquareHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 17c0 1.105-.895 2-2 2h-13.172c-.53 0-1.039 .211-1.414 .586L3.212 21.788c-.203 .203-.508 .264-.774 .154C2.173 21.832 2 21.573 2 21.286v-16.286C2 3.895 2.895 3 4 3h16c1.105 0 2 .895 2 2Z")
            addPathData("M7.5 9.5c0 .687 .265 1.383 .697 1.844l3.009 3.264c.11 .134 .249 .242 .407 .314 .251 .105 .533 .104 .783-.004 .154-.072 .29-.178 .398-.31l3.008-3.264c.451-.508 .699-1.165 .698-1.844 0-1.076-.689-2.031-1.709-2.372C13.77 6.788 12.646 7.139 12 8 11.354 7.139 10.23 6.788 9.209 7.128 8.189 7.469 7.5 8.424 7.5 9.5")
        }
        return _messageSquareHeart!!
    }

private var _messageSquareHeart: ImageVector? = null
