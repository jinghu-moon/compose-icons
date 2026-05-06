package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MessageReply: ImageVector
    get() {
        if (_messageReply != null) return _messageReply!!
        _messageReply = tablerOutlineIcon(
            name = "MessageReply",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 4c1.657 0 3 1.343 3 3v8c0 1.657-1.343 3-3 3h-5L8 21v-3h-2C4.343 18 3 16.657 3 15v-8C3 5.343 4.343 4 6 4h12")
            addPathData("M11 8 8 11l3 3")
            addPathData("M16 11h-8")
        }
        return _messageReply!!
    }

private var _messageReply: ImageVector? = null
