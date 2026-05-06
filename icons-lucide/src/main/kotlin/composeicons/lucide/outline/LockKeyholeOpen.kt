package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LockKeyholeOpen: ImageVector
    get() {
        if (_lockKeyholeOpen != null) return _lockKeyholeOpen!!
        _lockKeyholeOpen = lucideOutlineIcon(
            name = "LockKeyholeOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 16c0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
            addPathData("M5 10h14c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-14C3.895 22 3 21.105 3 20v-8c0-1.105 .895-2 2-2Z")
            addPathData("M7 10v-3C7 4.737 8.52 2.756 10.706 2.171c2.186-.586 4.493 .37 5.624 2.329")
        }
        return _lockKeyholeOpen!!
    }

private var _lockKeyholeOpen: ImageVector? = null
