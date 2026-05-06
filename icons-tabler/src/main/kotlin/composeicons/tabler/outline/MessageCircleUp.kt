package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MessageCircleUp: ImageVector
    get() {
        if (_messageCircleUp != null) return _messageCircleUp!!
        _messageCircleUp = tablerOutlineIcon(
            name = "MessageCircleUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.004 19.98C10.514 19.982 9.042 19.647 7.7 19L3 20 4.3 16.1C1.976 12.663 2.874 8.228 6.4 5.726 9.926 3.225 14.99 3.43 18.245 6.206c1.994 1.701 2.932 4.045 2.746 6.349")
            addPathData("M19 22v-6")
            addPathData("M22 19 19 16l-3 3")
        }
        return _messageCircleUp!!
    }

private var _messageCircleUp: ImageVector? = null
