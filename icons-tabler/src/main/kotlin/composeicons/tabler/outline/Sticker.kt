package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sticker: ImageVector
    get() {
        if (_sticker != null) return _sticker!!
        _sticker = tablerOutlineIcon(
            name = "Sticker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 12l-2 .5c-1.767 .155-3.511-.48-4.765-1.735C11.98 9.511 11.345 7.767 11.5 6L12 4l8 8")
            addPathData("M20 12c0 4.418-3.582 8-8 8C7.582 20 4 16.418 4 12 4 7.582 7.582 4 12 4")
        }
        return _sticker!!
    }

private var _sticker: ImageVector? = null
