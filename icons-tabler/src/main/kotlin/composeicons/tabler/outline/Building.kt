package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Building: ImageVector
    get() {
        if (_building != null) return _building!!
        _building = tablerOutlineIcon(
            name = "Building",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 21h18")
            addPathData("M9 8h1")
            addPathData("M9 12h1")
            addPathData("M9 16h1")
            addPathData("M14 8h1")
            addPathData("M14 12h1")
            addPathData("M14 16h1")
            addPathData("M5 21v-16C5 3.895 5.895 3 7 3h10c1.105 0 2 .895 2 2v16")
        }
        return _building!!
    }

private var _building: ImageVector? = null
