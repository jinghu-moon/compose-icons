package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MessageCircleUser: ImageVector
    get() {
        if (_messageCircleUser != null) return _messageCircleUser!!
        _messageCircleUser = tablerOutlineIcon(
            name = "MessageCircleUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M22 22c0-1.105-.895-2-2-2h-2c-1.105 0-2 .895-2 2")
            addPathData("M12.454 19.97C10.813 20.046 9.18 19.713 7.7 19L3 20 4.3 16.1C1.976 12.663 2.874 8.228 6.4 5.726 9.926 3.225 14.99 3.43 18.245 6.206c1.667 1.423 2.596 3.294 2.747 5.216")
        }
        return _messageCircleUser!!
    }

private var _messageCircleUser: ImageVector? = null
