package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MessageSquareOff: ImageVector
    get() {
        if (_messageSquareOff != null) return _messageSquareOff!!
        _messageSquareOff = lucideOutlineIcon(
            name = "MessageSquareOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 19h-12.172c-.53 0-1.039 .211-1.414 .586L3.212 21.788c-.199 .214-.51 .282-.78 .17C2.162 21.846 1.99 21.578 2 21.286v-16.286C2 4.211 2.464 3.496 3.184 3.174")
            addPathData("M2 2 22 22")
            addPathData("M8.656 3h11.344c1.105 0 2 .895 2 2v11.344")
        }
        return _messageSquareOff!!
    }

private var _messageSquareOff: ImageVector? = null
