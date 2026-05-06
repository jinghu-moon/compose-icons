package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MailAi: ImageVector
    get() {
        if (_mailAi != null) return _mailAi!!
        _mailAi = tablerOutlineIcon(
            name = "MailAi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 19h-5C3.895 19 3 18.105 3 17v-10C3 5.895 3.895 5 5 5h14c1.105 0 2 .895 2 2v4")
            addPathData("M3 7l8 5.345M15 11 21 7")
            addPathData("M14 21v-4c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v4")
            addPathData("M14 19h4")
            addPathData("M21 15v6")
        }
        return _mailAi!!
    }

private var _mailAi: ImageVector? = null
