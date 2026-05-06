package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MessageCircleHeart: ImageVector
    get() {
        if (_messageCircleHeart != null) return _messageCircleHeart!!
        _messageCircleHeart = lucideOutlineIcon(
            name = "MessageCircleHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2.992 16.342c.147 .371 .18 .777 .094 1.167L2.021 20.799c-.07 .339 .041 .69 .293 .928 .252 .238 .609 .329 .943 .24l3.413-.998c.368-.073 .749-.041 1.099 .092 4.409 2.059 9.659 .646 12.439-3.348C22.987 13.72 22.489 8.306 19.028 4.886 15.567 1.467 10.147 1.035 6.187 3.863 2.228 6.692 .88 11.959 2.992 16.342")
            addPathData("M7.828 13.07C6.714 11.905 6.72 10.067 7.842 8.909 8.964 7.752 10.8 7.687 12 8.764c.88-.79 2.142-.989 3.222-.509 1.081 .48 1.778 1.55 1.782 2.733 .002 .776-.296 1.522-.832 2.083l-3.447 3.62c-.189 .199-.451 .311-.725 .311-.274-0-.536-.113-.725-.312Z")
        }
        return _messageCircleHeart!!
    }

private var _messageCircleHeart: ImageVector? = null
