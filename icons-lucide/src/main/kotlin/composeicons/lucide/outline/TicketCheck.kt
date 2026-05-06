package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TicketCheck: ImageVector
    get() {
        if (_ticketCheck != null) return _ticketCheck!!
        _ticketCheck = lucideOutlineIcon(
            name = "TicketCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 9c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3v2c0 1.105 .895 2 2 2h16c1.105 0 2-.895 2-2v-2c-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3v-2C22 5.895 21.105 5 20 5h-16C2.895 5 2 5.895 2 7Z")
            addPathData("M9 12l2 2 4-4")
        }
        return _ticketCheck!!
    }

private var _ticketCheck: ImageVector? = null
