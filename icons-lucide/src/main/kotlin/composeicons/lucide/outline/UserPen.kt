package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UserPen: ImageVector
    get() {
        if (_userPen != null) return _userPen!!
        _userPen = lucideOutlineIcon(
            name = "UserPen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.5 15h-4.5C4.791 15 3 16.791 3 19v2")
            addPathData("M21.378 16.626c.83-.83 .83-2.174 0-3.004-.83-.83-2.174-.83-3.004 0l-4.01 4.012c-.238 .238-.412 .531-.506 .854l-.837 2.87c-.051 .175-.003 .364 .126 .494 .129 .129 .318 .178 .494 .126l2.87-.837c.323-.094 .616-.268 .854-.506Z")
            addPathData("M14 7c0 2.209-1.791 4-4 4C7.791 11 6 9.209 6 7 6 4.791 7.791 3 10 3c2.209 0 4 1.791 4 4Z")
        }
        return _userPen!!
    }

private var _userPen: ImageVector? = null
