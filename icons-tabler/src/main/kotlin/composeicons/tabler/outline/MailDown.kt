package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MailDown: ImageVector
    get() {
        if (_mailDown != null) return _mailDown!!
        _mailDown = tablerOutlineIcon(
            name = "MailDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 19h-7C3.895 19 3 18.105 3 17v-10C3 5.895 3.895 5 5 5h14c1.105 0 2 .895 2 2v5.5")
            addPathData("M19 16v6")
            addPathData("M22 19l-3 3L16 19")
            addPathData("M3 7l9 6L21 7")
        }
        return _mailDown!!
    }

private var _mailDown: ImageVector? = null
