package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquarePlus2: ImageVector
    get() {
        if (_squarePlus2 != null) return _squarePlus2!!
        _squarePlus2 = tablerOutlineIcon(
            name = "SquarePlus2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.5 21h-7.5C3.895 21 3 20.105 3 19v-14C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v7.5")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _squarePlus2!!
    }

private var _squarePlus2: ImageVector? = null
