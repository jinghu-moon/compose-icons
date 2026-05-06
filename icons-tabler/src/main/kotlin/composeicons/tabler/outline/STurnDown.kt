package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.STurnDown: ImageVector
    get() {
        if (_sTurnDown != null) return _sTurnDown!!
        _sTurnDown = tablerOutlineIcon(
            name = "STurnDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 5C7 6.105 6.105 7 5 7 3.895 7 3 6.105 3 5 3 3.895 3.895 3 5 3c1.105 0 2 .895 2 2")
            addPathData("M5 7v9.5C5 18.433 6.567 20 8.5 20 10.433 20 12 18.433 12 16.5v-9C12 5.567 13.567 4 15.5 4 17.433 4 19 5.567 19 7.5v13.5")
            addPathData("M16 18l3 3 3-3")
        }
        return _sTurnDown!!
    }

private var _sTurnDown: ImageVector? = null
