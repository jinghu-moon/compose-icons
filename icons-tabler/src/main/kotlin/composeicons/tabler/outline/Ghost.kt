package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ghost: ImageVector
    get() {
        if (_ghost != null) return _ghost!!
        _ghost = tablerOutlineIcon(
            name = "Ghost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 11C5 7.134 8.134 4 12 4c3.866 0 7 3.134 7 7v7c.097 .775-.322 1.522-1.034 1.844-.712 .321-1.549 .142-2.066-.444-.313-.4-.792-.634-1.3-.634-.508 0-.987 .234-1.3 .634-.313 .4-.792 .634-1.3 .634-.508 0-.987-.234-1.3-.634-.313-.4-.792-.634-1.3-.634-.508 0-.987 .234-1.3 .634-.517 .585-1.355 .765-2.066 .444C5.322 19.522 4.903 18.775 5 18v-7")
            addPathData("M10 10h.01")
            addPathData("M14 10h.01")
            addPathData("M10 14c1.202 .837 2.798 .837 4 0")
        }
        return _ghost!!
    }

private var _ghost: ImageVector? = null
