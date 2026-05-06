package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MessageCircleCheck: ImageVector
    get() {
        if (_messageCircleCheck != null) return _messageCircleCheck!!
        _messageCircleCheck = lucideOutlineIcon(
            name = "MessageCircleCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2.992 16.342c.147 .371 .18 .777 .094 1.167L2.021 20.799c-.07 .339 .041 .69 .293 .928 .252 .238 .609 .329 .943 .24l3.413-.998c.368-.073 .749-.041 1.099 .092 4.409 2.059 9.659 .646 12.439-3.348C22.987 13.72 22.489 8.306 19.028 4.886 15.567 1.467 10.147 1.035 6.187 3.863 2.228 6.692 .88 11.959 2.992 16.342")
            addPathData("M9 12l2 2 4-4")
        }
        return _messageCircleCheck!!
    }

private var _messageCircleCheck: ImageVector? = null
