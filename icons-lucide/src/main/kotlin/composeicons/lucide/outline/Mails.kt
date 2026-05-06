package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Mails: ImageVector
    get() {
        if (_mails != null) return _mails!!
        _mails = lucideOutlineIcon(
            name = "Mails",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 19c0 1.105-.895 2-2 2h-11C2.895 21 2 20.105 2 19v-8c0-.715 .381-1.375 1-1.732")
            addPathData("M22 5.5 15.581 9.679c-.659 .423-1.503 .423-2.162 0L7 5.5")
            addPathData("M9 3h11c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-11C7.895 15 7 14.105 7 13v-8C7 3.895 7.895 3 9 3Z")
        }
        return _mails!!
    }

private var _mails: ImageVector? = null
