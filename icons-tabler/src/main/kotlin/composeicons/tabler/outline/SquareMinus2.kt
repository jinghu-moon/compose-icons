package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquareMinus2: ImageVector
    get() {
        if (_squareMinus2 != null) return _squareMinus2!!
        _squareMinus2 = tablerOutlineIcon(
            name = "SquareMinus2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.5 21h-7.5C3.895 21 3 20.105 3 19v-14C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v10")
            addPathData("M16 19h6")
        }
        return _squareMinus2!!
    }

private var _squareMinus2: ImageVector? = null
