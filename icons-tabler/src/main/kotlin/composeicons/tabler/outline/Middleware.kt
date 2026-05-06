package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Middleware: ImageVector
    get() {
        if (_middleware != null) return _middleware!!
        _middleware = tablerOutlineIcon(
            name = "Middleware",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 20 6.25 17.75")
            addPathData("M20 20 17.75 17.75")
            addPathData("M20 4 17.75 6.25")
            addPathData("M4 4 6.25 6.25")
            addPathData("M10 19.748C7.182 19.018 4.982 16.818 4.253 14")
            addPathData("M19.748 14c-.729 2.818-2.93 5.019-5.748 5.748")
            addPathData("M4.252 10C4.958 7.28 7.036 5.128 9.73 4.328L10 4.253")
            addPathData("M14 4.252c2.818 .729 5.019 2.931 5.748 5.749")
            addPathData("M11 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
        }
        return _middleware!!
    }

private var _middleware: ImageVector? = null
