package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MessageCirclePause: ImageVector
    get() {
        if (_messageCirclePause != null) return _messageCirclePause!!
        _messageCirclePause = tablerOutlineIcon(
            name = "MessageCirclePause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.989 19.932C11.174 20.113 9.344 19.791 7.7 19L3 20 4.3 16.1C1.976 12.663 2.874 8.228 6.4 5.726 9.926 3.225 14.99 3.43 18.245 6.206c2.131 1.818 3.056 4.37 2.692 6.824")
            addPathData("M17 17v5")
            addPathData("M21 17v5")
        }
        return _messageCirclePause!!
    }

private var _messageCirclePause: ImageVector? = null
