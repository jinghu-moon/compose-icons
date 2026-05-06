package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MessageCircleQuestionMark: ImageVector
    get() {
        if (_messageCircleQuestionMark != null) return _messageCircleQuestionMark!!
        _messageCircleQuestionMark = lucideOutlineIcon(
            name = "MessageCircleQuestionMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2.992 16.342c.147 .371 .18 .777 .094 1.167L2.021 20.799c-.07 .339 .041 .69 .293 .928 .252 .238 .609 .329 .943 .24l3.413-.998c.368-.073 .749-.041 1.099 .092 4.409 2.059 9.659 .646 12.439-3.348C22.987 13.72 22.489 8.306 19.028 4.886 15.567 1.467 10.147 1.035 6.187 3.863 2.228 6.692 .88 11.959 2.992 16.342")
            addPathData("M9.09 9C9.575 7.62 10.985 6.791 12.427 7.039c1.442 .247 2.495 1.498 2.493 2.961 0 2-3 3-3 3")
            addPathData("M12 17h.01")
        }
        return _messageCircleQuestionMark!!
    }

private var _messageCircleQuestionMark: ImageVector? = null
