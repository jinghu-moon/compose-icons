package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MessageCircleOff: ImageVector
    get() {
        if (_messageCircleOff != null) return _messageCircleOff!!
        _messageCircleOff = lucideOutlineIcon(
            name = "MessageCircleOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 2 22 22")
            addPathData("M4.93 4.929C1.924 7.935 1.147 12.512 2.992 16.341c.147 .371 .18 .777 .094 1.167L2.021 20.798c-.07 .339 .041 .69 .293 .928 .252 .238 .609 .329 .943 .24l3.413-.998c.368-.073 .749-.041 1.099 .092 3.811 1.78 8.328 .985 11.302-1.989")
            addPathData("M8.35 2.69c3.7-1.445 7.904-.563 10.712 2.246 2.808 2.81 3.686 7.015 2.238 10.714")
        }
        return _messageCircleOff!!
    }

private var _messageCircleOff: ImageVector? = null
