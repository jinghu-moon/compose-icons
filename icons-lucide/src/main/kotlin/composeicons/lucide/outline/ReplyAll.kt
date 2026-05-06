package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ReplyAll: ImageVector
    get() {
        if (_replyAll != null) return _replyAll!!
        _replyAll = lucideOutlineIcon(
            name = "ReplyAll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 17 7 12 12 7")
            addPathData("M22 18v-2c0-2.209-1.791-4-4-4h-11")
            addPathData("M7 17 2 12 7 7")
        }
        return _replyAll!!
    }

private var _replyAll: ImageVector? = null
