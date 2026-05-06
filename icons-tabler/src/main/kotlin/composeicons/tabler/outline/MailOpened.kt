package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MailOpened: ImageVector
    get() {
        if (_mailOpened != null) return _mailOpened!!
        _mailOpened = tablerOutlineIcon(
            name = "MailOpened",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 9l9 6L21 9 12 3 3 9")
            addPathData("M21 9v10c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-10")
            addPathData("M3 19 9 13")
            addPathData("M15 13l6 6")
        }
        return _mailOpened!!
    }

private var _mailOpened: ImageVector? = null
