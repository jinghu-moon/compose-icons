package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MailOpen: ImageVector
    get() {
        if (_mailOpen != null) return _mailOpen!!
        _mailOpen = lucideOutlineIcon(
            name = "MailOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21.2 8.4C21.7 8.78 22 9.37 22 10v10c0 1.105-.895 2-2 2h-16C2.895 22 2 21.105 2 20v-10C2 9.37 2.296 8.778 2.8 8.4L10.8 2.4c.711-.533 1.689-.533 2.4 0l8 6Z")
            addPathData("M22 10l-8.97 5.7c-.63 .395-1.43 .395-2.06 0L2 10")
        }
        return _mailOpen!!
    }

private var _mailOpen: ImageVector? = null
