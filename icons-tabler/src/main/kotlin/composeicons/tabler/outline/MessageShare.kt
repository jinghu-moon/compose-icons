package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MessageShare: ImageVector
    get() {
        if (_messageShare != null) return _messageShare!!
        _messageShare = tablerOutlineIcon(
            name = "MessageShare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 9h8")
            addPathData("M8 13h6")
            addPathData("M13 18 8 21v-3h-2C4.343 18 3 16.657 3 15v-8C3 5.343 4.343 4 6 4h12c1.657 0 3 1.343 3 3v6")
            addPathData("M16 22l5-5")
            addPathData("M21 21.5v-4.5h-4.5")
        }
        return _messageShare!!
    }

private var _messageShare: ImageVector? = null
