package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Signpost: ImageVector
    get() {
        if (_signpost != null) return _signpost!!
        _signpost = lucideOutlineIcon(
            name = "Signpost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 13v8")
            addPathData("M12 3v3")
            addPathData("M2.354 10.354c-.227-.226-.354-.534-.354-.854 0-.32 .127-.628 .354-.854L4.414 6.586C4.789 6.211 5.298 6 5.828 6h12.344c.53 0 1.039 .211 1.414 .586l2.06 2.06c.227 .226 .354 .534 .354 .854 0 .32-.127 .628-.354 .854l-2.06 2.06c-.375 .375-.884 .586-1.414 .586h-12.344c-.53-0-1.039-.211-1.414-.586Z")
        }
        return _signpost!!
    }

private var _signpost: ImageVector? = null
