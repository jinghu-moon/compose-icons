package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MailExclamation: ImageVector
    get() {
        if (_mailExclamation != null) return _mailExclamation!!
        _mailExclamation = tablerOutlineIcon(
            name = "MailExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 19h-10C3.895 19 3 18.105 3 17v-10C3 5.895 3.895 5 5 5h14c1.105 0 2 .895 2 2v5.5")
            addPathData("M3 7l9 6L21 7")
            addPathData("M19 16v3")
            addPathData("M19 22v.01")
        }
        return _mailExclamation!!
    }

private var _mailExclamation: ImageVector? = null
