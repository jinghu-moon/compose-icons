package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MessageCircleDown: ImageVector
    get() {
        if (_messageCircleDown != null) return _messageCircleDown!!
        _messageCircleDown = tablerOutlineIcon(
            name = "MessageCircleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.006 19.98C10.515 19.983 9.043 19.648 7.7 19L3 20 4.3 16.1C1.976 12.663 2.874 8.228 6.4 5.726 9.926 3.225 14.99 3.43 18.245 6.206c1.993 1.7 2.93 4.041 2.746 6.344")
            addPathData("M19 16v6")
            addPathData("M22 19l-3 3L16 19")
        }
        return _messageCircleDown!!
    }

private var _messageCircleDown: ImageVector? = null
