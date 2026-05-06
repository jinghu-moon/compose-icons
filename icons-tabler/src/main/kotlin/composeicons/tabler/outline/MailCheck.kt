package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MailCheck: ImageVector
    get() {
        if (_mailCheck != null) return _mailCheck!!
        _mailCheck = tablerOutlineIcon(
            name = "MailCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 19h-6C3.895 19 3 18.105 3 17v-10C3 5.895 3.895 5 5 5h14c1.105 0 2 .895 2 2v6")
            addPathData("M3 7l9 6L21 7")
            addPathData("M15 19l2 2 4-4")
        }
        return _mailCheck!!
    }

private var _mailCheck: ImageVector? = null
