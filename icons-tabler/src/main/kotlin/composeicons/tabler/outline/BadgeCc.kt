package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BadgeCc: ImageVector
    get() {
        if (_badgeCc != null) return _badgeCc!!
        _badgeCc = tablerOutlineIcon(
            name = "BadgeCc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7C3 5.895 3.895 5 5 5h14c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-14C3.895 19 3 18.105 3 17v-10")
            addPathData("M10 10.5C10 9.672 9.328 9 8.5 9 7.672 9 7 9.672 7 10.5v3C7 14.328 7.672 15 8.5 15 9.328 15 10 14.328 10 13.5")
            addPathData("M17 10.5C17 9.672 16.328 9 15.5 9 14.672 9 14 9.672 14 10.5v3c0 .828 .672 1.5 1.5 1.5C16.328 15 17 14.328 17 13.5")
        }
        return _badgeCc!!
    }

private var _badgeCc: ImageVector? = null
