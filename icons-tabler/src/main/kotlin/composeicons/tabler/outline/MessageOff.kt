package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MessageOff: ImageVector
    get() {
        if (_messageOff != null) return _messageOff!!
        _messageOff = tablerOutlineIcon(
            name = "MessageOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 9h1M13 9h3")
            addPathData("M8 13h5")
            addPathData("M8 4h10c1.657 0 3 1.343 3 3v8c0 .577-.163 1.116-.445 1.573M18 18h-5L8 21v-3h-2C4.343 18 3 16.657 3 15v-8C3 5.915 3.576 4.964 4.439 4.438")
            addPathData("M3 3 21 21")
        }
        return _messageOff!!
    }

private var _messageOff: ImageVector? = null
