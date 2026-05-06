package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Teapot: ImageVector
    get() {
        if (_teapot != null) return _teapot!!
        _teapot = tablerOutlineIcon(
            name = "Teapot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.29 3h3.42c1.019-0 1.876 .767 1.988 1.78l1.555 14c.063 .565-.119 1.131-.498 1.554-.379 .424-.921 .666-1.49 .666h-6.53c-.569 0-1.111-.242-1.49-.666-.379-.424-.561-.989-.498-1.554L8.302 4.78C8.414 3.767 9.271 3 10.29 3")
            addPathData("M7.47 12.5 3.213 7.481C2.986 7.213 2.935 6.838 3.083 6.519 3.232 6.201 3.552 5.998 3.903 6h13.09c.797-.002 1.562 .313 2.126 .876 .564 .563 .881 1.327 .881 2.124v3c0 1.657-1.346 3-3.007 3")
            addPathData("M7 17h10")
        }
        return _teapot!!
    }

private var _teapot: ImageVector? = null
