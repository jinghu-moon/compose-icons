package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MessageCircleX: ImageVector
    get() {
        if (_messageCircleX != null) return _messageCircleX!!
        _messageCircleX = tablerOutlineIcon(
            name = "MessageCircleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.593 19.855C11.587 20.178 9.531 19.879 7.7 19L3 20 4.3 16.1C1.976 12.663 2.874 8.228 6.4 5.726 9.926 3.225 14.99 3.43 18.245 6.206c2.128 1.816 3.053 4.363 2.693 6.813")
            addPathData("M22 22 17 17")
            addPathData("M17 22l5-5")
        }
        return _messageCircleX!!
    }

private var _messageCircleX: ImageVector? = null
