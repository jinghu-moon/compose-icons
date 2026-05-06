package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MessagesOff: ImageVector
    get() {
        if (_messagesOff != null) return _messagesOff!!
        _messagesOff = tablerOutlineIcon(
            name = "MessagesOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3 21 21")
            addPathData("M11 11c-.552 0-1-.448-1-1M10 6.032v-2.032c0-.552 .448-1 1-1h9c.552 0 1 .448 1 1v10L18 11h-3")
            addPathData("M14 15v2c0 .552-.448 1-1 1h-7L3 21v-10c0-.552 .448-1 1-1h2")
        }
        return _messagesOff!!
    }

private var _messagesOff: ImageVector? = null
