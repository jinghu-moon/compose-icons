package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MessageCirclePlus: ImageVector
    get() {
        if (_messageCirclePlus != null) return _messageCirclePlus!!
        _messageCirclePlus = tablerOutlineIcon(
            name = "MessageCirclePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.007 19.98C10.516 19.983 9.043 19.648 7.7 19L3 20 4.3 16.1C1.976 12.663 2.874 8.228 6.4 5.726 9.926 3.225 14.99 3.43 18.245 6.206c1.992 1.7 2.93 4.04 2.747 6.34")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _messageCirclePlus!!
    }

private var _messageCirclePlus: ImageVector? = null
