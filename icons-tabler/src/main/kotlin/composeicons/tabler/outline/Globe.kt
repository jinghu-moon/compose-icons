package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Globe: ImageVector
    get() {
        if (_globe != null) return _globe!!
        _globe = tablerOutlineIcon(
            name = "Globe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 9c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C15 6.791 13.209 5 11 5 8.791 5 7 6.791 7 9")
            addPathData("M5.75 15c2.302 1.999 5.539 2.52 8.351 1.342 2.812-1.178 4.713-3.849 4.904-6.892C19.196 6.407 17.643 3.519 15 2")
            addPathData("M11 17v4")
            addPathData("M7 21h8")
        }
        return _globe!!
    }

private var _globe: ImageVector? = null
