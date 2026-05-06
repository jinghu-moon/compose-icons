package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MessageMinus: ImageVector
    get() {
        if (_messageMinus != null) return _messageMinus!!
        _messageMinus = tablerOutlineIcon(
            name = "MessageMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 9h8")
            addPathData("M8 13h6")
            addPathData("M11.976 18.614 8 21v-3h-2C4.343 18 3 16.657 3 15v-8C3 5.343 4.343 4 6 4h12c1.657 0 3 1.343 3 3v8")
            addPathData("M16 19h6")
        }
        return _messageMinus!!
    }

private var _messageMinus: ImageVector? = null
