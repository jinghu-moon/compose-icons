package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MessageLanguage: ImageVector
    get() {
        if (_messageLanguage != null) return _messageLanguage!!
        _messageLanguage = tablerOutlineIcon(
            name = "MessageLanguage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 21v-13C4 6.343 5.343 5 7 5h10c1.657 0 3 1.343 3 3v6c0 1.657-1.343 3-3 3h-9L4 21")
            addPathData("M10 14v-4c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v4")
            addPathData("M14 12h-4")
        }
        return _messageLanguage!!
    }

private var _messageLanguage: ImageVector? = null
