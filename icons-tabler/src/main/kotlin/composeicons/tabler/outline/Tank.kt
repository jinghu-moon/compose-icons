package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Tank: ImageVector
    get() {
        if (_tank != null) return _tank!!
        _tank = tablerOutlineIcon(
            name = "Tank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 15C2 13.343 3.343 12 5 12h12c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3h-12C3.343 18 2 16.657 2 15")
            addPathData("M6 12 7 7h5l3 5")
            addPathData("M21 9h-7.8")
        }
        return _tank!!
    }

private var _tank: ImageVector? = null
