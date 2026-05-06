package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MailboxOff: ImageVector
    get() {
        if (_mailboxOff != null) return _mailboxOff!!
        _mailboxOff = tablerOutlineIcon(
            name = "MailboxOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 21v-6.5C10 12.567 8.433 11 6.5 11 4.567 11 3 12.567 3 14.5v6.5h18M21 17v-2c0-2.209-1.791-4-4-4h-2M11 11h-4.5")
            addPathData("M12 8v-5h4l2 2L16 7h-4")
            addPathData("M6 15h1")
            addPathData("M3 3 21 21")
        }
        return _mailboxOff!!
    }

private var _mailboxOff: ImageVector? = null
