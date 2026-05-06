package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClockPlay: ImageVector
    get() {
        if (_clockPlay != null) return _clockPlay!!
        _clockPlay = tablerOutlineIcon(
            name = "ClockPlay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 7v5l2 2")
            addPathData("M17 22l5-3L17 16v6")
            addPathData("M13.017 20.943C9.157 21.382 5.45 19.294 3.825 15.764 2.201 12.235 3.024 8.062 5.867 5.414 8.711 2.766 12.932 2.242 16.337 4.114c3.405 1.872 5.224 5.717 4.511 9.537")
        }
        return _clockPlay!!
    }

private var _clockPlay: ImageVector? = null
