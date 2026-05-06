package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Milestone: ImageVector
    get() {
        if (_milestone != null) return _milestone!!
        _milestone = lucideOutlineIcon(
            name = "Milestone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 13v8")
            addPathData("M12 3v3")
            addPathData("M18.172 6c.53 0 1.039 .211 1.414 .586l2.06 2.06c.227 .226 .354 .534 .354 .854 0 .32-.127 .628-.354 .854l-2.06 2.06c-.375 .375-.884 .586-1.414 .586h-14.172C3.448 13 3 12.552 3 12v-5C3 6.448 3.448 6 4 6Z")
        }
        return _milestone!!
    }

private var _milestone: ImageVector? = null
