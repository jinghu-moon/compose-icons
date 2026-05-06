package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Messages: ImageVector
    get() {
        if (_messages != null) return _messages!!
        _messages = tablerOutlineIcon(
            name = "Messages",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 14 18 11h-7c-.552 0-1-.448-1-1v-6c0-.552 .448-1 1-1h9c.552 0 1 .448 1 1v10")
            addPathData("M14 15v2c0 .552-.448 1-1 1h-7L3 21v-10c0-.552 .448-1 1-1h2")
        }
        return _messages!!
    }

private var _messages: ImageVector? = null
