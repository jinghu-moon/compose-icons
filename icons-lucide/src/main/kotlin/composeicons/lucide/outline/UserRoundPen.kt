package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UserRoundPen: ImageVector
    get() {
        if (_userRoundPen != null) return _userRoundPen!!
        _userRoundPen = lucideOutlineIcon(
            name = "UserRoundPen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 21C2 18.374 3.288 15.915 5.448 14.42c2.16-1.494 4.915-1.833 7.373-.907")
            addPathData("M21.378 16.626c.83-.83 .83-2.174 0-3.004-.83-.83-2.174-.83-3.004 0l-4.01 4.012c-.238 .238-.412 .531-.506 .854l-.837 2.87c-.051 .175-.003 .364 .126 .494 .129 .129 .318 .178 .494 .126l2.87-.837c.323-.094 .616-.268 .854-.506Z")
            addPathData("M15 8c0 2.761-2.239 5-5 5C7.239 13 5 10.761 5 8 5 5.239 7.239 3 10 3c2.761 0 5 2.239 5 5Z")
        }
        return _userRoundPen!!
    }

private var _userRoundPen: ImageVector? = null
