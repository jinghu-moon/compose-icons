package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MailOff: ImageVector
    get() {
        if (_mailOff != null) return _mailOff!!
        _mailOff = tablerOutlineIcon(
            name = "MailOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 5h10c1.105 0 2 .895 2 2v10M19 19h-14C3.895 19 3 18.105 3 17v-10C3 5.895 3.895 5 5 5")
            addPathData("M3 7l9 6 .565-.377M15 11 21 7")
            addPathData("M3 3 21 21")
        }
        return _mailOff!!
    }

private var _mailOff: ImageVector? = null
