package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Auth2Fa: ImageVector
    get() {
        if (_auth2Fa != null) return _auth2Fa!!
        _auth2Fa = tablerOutlineIcon(
            name = "Auth2Fa",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 16h-4L6.47 11.34c.585-.643 .688-1.591 .254-2.344C6.289 8.242 5.418 7.856 4.568 8.039 3.718 8.223 3.084 8.935 3 9.8")
            addPathData("M10 16v-8h4")
            addPathData("M10 12h3")
            addPathData("M17 16v-6c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v6")
            addPathData("M17 13h4")
        }
        return _auth2Fa!!
    }

private var _auth2Fa: ImageVector? = null
