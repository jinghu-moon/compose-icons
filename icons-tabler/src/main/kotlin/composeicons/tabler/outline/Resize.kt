package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Resize: ImageVector
    get() {
        if (_resize != null) return _resize!!
        _resize = tablerOutlineIcon(
            name = "Resize",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 11v8c0 .552 .448 1 1 1h8M4 6v-1C4 4.448 4.448 4 5 4h1M11 4h2M18 4h1c.552 0 1 .448 1 1v1M20 11v2M20 18v1c0 .552-.448 1-1 1h-1")
            addPathData("M4 12h7c.552 0 1 .448 1 1v7")
        }
        return _resize!!
    }

private var _resize: ImageVector? = null
