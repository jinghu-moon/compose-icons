package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Pepper: ImageVector
    get() {
        if (_pepper != null) return _pepper!!
        _pepper = tablerOutlineIcon(
            name = "Pepper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 11c0 2.21-2.239 4-5 4C5.239 15 3 13.21 3 11c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C19 9.343 17.657 8 16 8c-1.657 0-3 1.343-3 3")
            addPathData("M16 8C16 6 18 4 20 4")
        }
        return _pepper!!
    }

private var _pepper: ImageVector? = null
