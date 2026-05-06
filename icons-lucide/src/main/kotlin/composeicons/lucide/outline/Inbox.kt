package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Inbox: ImageVector
    get() {
        if (_inbox != null) return _inbox!!
        _inbox = lucideOutlineIcon(
            name = "Inbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12h-6l-2 3h-4L8 12h-6")
            addPathData("M5.45 5.11 2 12v6c0 1.105 .895 2 2 2h16c1.105 0 2-.895 2-2v-6L18.55 5.11C18.212 4.43 17.519 4 16.76 4h-9.52C6.481 4 5.788 4.43 5.45 5.11Z")
        }
        return _inbox!!
    }

private var _inbox: ImageVector? = null
