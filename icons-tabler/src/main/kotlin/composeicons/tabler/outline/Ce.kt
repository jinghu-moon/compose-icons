package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ce: ImageVector
    get() {
        if (_ce != null) return _ce!!
        _ce = tablerOutlineIcon(
            name = "Ce",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 6C5.686 6 3 8.686 3 12c0 3.314 2.686 6 6 6")
            addPathData("M21 6c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6")
            addPathData("M15 12h6")
        }
        return _ce!!
    }

private var _ce: ImageVector? = null
