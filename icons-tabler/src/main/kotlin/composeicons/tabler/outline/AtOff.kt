package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AtOff: ImageVector
    get() {
        if (_atOff != null) return _atOff!!
        _atOff = tablerOutlineIcon(
            name = "AtOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.174 9.17c-1.565 1.559-1.57 4.092-.011 5.657 1.559 1.565 4.092 1.57 5.657 .011M16 12C16 9.791 14.209 8 12 8")
            addPathData("M19.695 15.697c.805-.438 1.305-1.281 1.305-2.197v-1.5C21.004 8.873 19.385 5.967 16.722 4.326 14.06 2.685 10.737 2.544 7.945 3.953M5.623 5.636C2.585 8.684 2.13 13.455 4.536 17.022c2.406 3.567 7.001 4.932 10.964 3.258")
            addPathData("M3 3 21 21")
        }
        return _atOff!!
    }

private var _atOff: ImageVector? = null
