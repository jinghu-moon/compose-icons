package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MailForward: ImageVector
    get() {
        if (_mailForward != null) return _mailForward!!
        _mailForward = tablerOutlineIcon(
            name = "MailForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 18h-7C3.895 18 3 17.105 3 16v-10C3 4.895 3.895 4 5 4h14c1.105 0 2 .895 2 2v7.5")
            addPathData("M3 6l9 6L21 6")
            addPathData("M15 18h6")
            addPathData("M18 15l3 3-3 3")
        }
        return _mailForward!!
    }

private var _mailForward: ImageVector? = null
