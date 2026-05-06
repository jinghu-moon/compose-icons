package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ThumbDownOff: ImageVector
    get() {
        if (_thumbDownOff != null) return _thumbDownOff!!
        _thumbDownOff = tablerOutlineIcon(
            name = "ThumbDownOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 13v-6M4 4C3.448 4 3 4.448 3 5v7c0 .552 .448 1 1 1h3c2.209 0 4 1.791 4 4v1c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-3M17 13h1c1.105 0 2-.895 2-2L19 6C18.705 4.74 17.89 3.924 17 4h-7C9.43 4 8.898 4.159 8.444 4.434")
            addPathData("M3 3 21 21")
        }
        return _thumbDownOff!!
    }

private var _thumbDownOff: ImageVector? = null
