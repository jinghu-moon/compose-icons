package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CreativeCommonsZero: ImageVector
    get() {
        if (_creativeCommonsZero != null) return _creativeCommonsZero!!
        _creativeCommonsZero = tablerOutlineIcon(
            name = "CreativeCommonsZero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M9 12c0 2.209 1.343 4 3 4 1.657 0 3-1.791 3-4C15 9.791 13.657 8 12 8 10.343 8 9 9.791 9 12")
            addPathData("M14 9l-4 6")
        }
        return _creativeCommonsZero!!
    }

private var _creativeCommonsZero: ImageVector? = null
