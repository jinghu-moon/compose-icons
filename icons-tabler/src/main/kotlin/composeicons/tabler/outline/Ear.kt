package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ear: ImageVector
    get() {
        if (_ear != null) return _ear!!
        _ear = tablerOutlineIcon(
            name = "Ear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 10C5.998 7.042 7.855 4.401 10.641 3.404c2.785-.997 5.897-.135 7.772 2.152 1.876 2.288 2.111 5.508 .587 8.044-.569 .758-1.242 1.431-2 2-.886 .835-1.57 1.861-2 3-.628 1.187-1.754 2.032-3.07 2.303C10.614 21.174 9.246 20.843 8.2 20")
            addPathData("M10 10C9.983 8.617 10.914 7.402 12.254 7.058c1.34-.344 2.741 .273 3.392 1.493 .652 1.22 .385 2.727-.646 3.649")
        }
        return _ear!!
    }

private var _ear: ImageVector? = null
