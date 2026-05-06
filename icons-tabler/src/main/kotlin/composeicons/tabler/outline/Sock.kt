package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sock: ImageVector
    get() {
        if (_sock != null) return _sock!!
        _sock = tablerOutlineIcon(
            name = "Sock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 3v6l4.798 5.142c1.541 1.518 1.596 3.986 .124 5.571-1.472 1.585-3.937 1.713-5.565 .289L5.621 13.592C5.224 13.214 4.999 12.689 5 12.141v-9.141h8")
            addPathData("M7.895 15.768C8.603 15.047 9 14.091 9 13 9 10.791 7.209 9 5 9")
        }
        return _sock!!
    }

private var _sock: ImageVector? = null
