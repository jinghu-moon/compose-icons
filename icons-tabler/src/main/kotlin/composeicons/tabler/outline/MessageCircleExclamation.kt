package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MessageCircleExclamation: ImageVector
    get() {
        if (_messageCircleExclamation != null) return _messageCircleExclamation!!
        _messageCircleExclamation = tablerOutlineIcon(
            name = "MessageCircleExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.02 19.52c-2.34 .736-5 .606-7.32-.52L3 20 4.3 16.1C1.976 12.663 2.874 8.228 6.4 5.726 9.926 3.225 14.99 3.43 18.245 6.206c1.96 1.671 2.898 3.963 2.755 6.227")
            addPathData("M19 16v3")
            addPathData("M19 22v.01")
        }
        return _messageCircleExclamation!!
    }

private var _messageCircleExclamation: ImageVector? = null
