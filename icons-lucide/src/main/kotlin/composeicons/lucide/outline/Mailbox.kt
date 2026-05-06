package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Mailbox: ImageVector
    get() {
        if (_mailbox != null) return _mailbox!!
        _mailbox = lucideOutlineIcon(
            name = "Mailbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 17c0 1.105-.895 2-2 2h-16C2.895 19 2 18.105 2 17v-7.5C2 7 4 5 6.5 5h11.5c2.2 0 4 1.8 4 4v8Z")
            addPathData("M15 9h3v2")
            addPathData("M6.5 5C9 5 11 7 11 9.5v7.5c0 1.105-.895 2-2 2")
            addPathData("M6 10h1")
        }
        return _mailbox!!
    }

private var _mailbox: ImageVector? = null
