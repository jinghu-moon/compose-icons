package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClockPlus: ImageVector
    get() {
        if (_clockPlus != null) return _clockPlus!!
        _clockPlus = tablerOutlineIcon(
            name = "ClockPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.984 12.535C21.206 8.806 19.101 5.327 15.694 3.793 12.287 2.259 8.287 2.99 5.643 5.629 2.998 8.268 2.259 12.267 3.785 15.677c1.526 3.41 5.001 5.523 8.731 5.308")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
            addPathData("M12 7v5l3 3")
        }
        return _clockPlus!!
    }

private var _clockPlus: ImageVector? = null
