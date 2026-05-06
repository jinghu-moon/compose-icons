package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClipboardCopy: ImageVector
    get() {
        if (_clipboardCopy != null) return _clipboardCopy!!
        _clipboardCopy = tablerOutlineIcon(
            name = "ClipboardCopy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 5h-2C5.895 5 5 5.895 5 7v12c0 1.105 .895 2 2 2h3M19 12v-5C19 5.895 18.105 5 17 5h-2")
            addPathData("M13 17v-1c0-.552 .448-1 1-1h1M18 15h1c.552 0 1 .448 1 1v1M20 20v1c0 .552-.448 1-1 1h-1M15 22h-1c-.552 0-1-.448-1-1v-1")
            addPathData("M9 5C9 3.895 9.895 3 11 3h2c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-2C9.895 7 9 6.105 9 5")
        }
        return _clipboardCopy!!
    }

private var _clipboardCopy: ImageVector? = null
