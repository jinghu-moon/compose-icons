package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MessageCircleCheck: ImageVector
    get() {
        if (_messageCircleCheck != null) return _messageCircleCheck!!
        _messageCircleCheck = tablerOutlineIcon(
            name = "MessageCircleCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.042 19.933C9.881 19.823 8.75 19.507 7.7 19L3 20 4.3 16.1C1.976 12.663 2.874 8.228 6.4 5.726 9.926 3.225 14.99 3.43 18.245 6.206c2.127 1.814 3.052 4.36 2.694 6.808")
            addPathData("M15 19l2 2 4-4")
        }
        return _messageCircleCheck!!
    }

private var _messageCircleCheck: ImageVector? = null
