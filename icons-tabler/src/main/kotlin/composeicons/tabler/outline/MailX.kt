package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MailX: ImageVector
    get() {
        if (_mailX != null) return _mailX!!
        _mailX = tablerOutlineIcon(
            name = "MailX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.5 19h-8.5C3.895 19 3 18.105 3 17v-10C3 5.895 3.895 5 5 5h14c1.105 0 2 .895 2 2v6")
            addPathData("M3 7l9 6L21 7")
            addPathData("M22 22 17 17")
            addPathData("M17 22l5-5")
        }
        return _mailX!!
    }

private var _mailX: ImageVector? = null
