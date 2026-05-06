package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MailPause: ImageVector
    get() {
        if (_mailPause != null) return _mailPause!!
        _mailPause = tablerOutlineIcon(
            name = "MailPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 19h-8C3.895 19 3 18.105 3 17v-10C3 5.895 3.895 5 5 5h14c1.105 0 2 .895 2 2v6")
            addPathData("M3 7l9 6L21 7")
            addPathData("M17 17v5")
            addPathData("M21 17v5")
        }
        return _mailPause!!
    }

private var _mailPause: ImageVector? = null
