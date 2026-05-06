package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MessageCircleMinus: ImageVector
    get() {
        if (_messageCircleMinus != null) return _messageCircleMinus!!
        _messageCircleMinus = tablerOutlineIcon(
            name = "MessageCircleMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.023 19.98C10.526 19.985 9.048 19.65 7.7 19L3 20 4.3 16.1C1.976 12.663 2.874 8.228 6.4 5.726 9.926 3.225 14.99 3.43 18.245 6.206c2.718 2.319 3.473 5.832 2.096 8.811")
            addPathData("M16 19h6")
        }
        return _messageCircleMinus!!
    }

private var _messageCircleMinus: ImageVector? = null
