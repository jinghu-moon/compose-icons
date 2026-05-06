package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WorldMinus: ImageVector
    get() {
        if (_worldMinus != null) return _worldMinus!!
        _worldMinus = tablerOutlineIcon(
            name = "WorldMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.483 15.006C21.809 11.265 20.527 7.096 17.328 4.746 14.129 2.396 9.768 2.419 6.595 4.803 3.421 7.188 2.184 11.369 3.55 15.096c1.366 3.727 5.012 6.119 8.975 5.888")
            addPathData("M3.6 9h16.8")
            addPathData("M3.6 15h16.8")
            addPathData("M11.5 3c-3.437 5.508-3.437 12.492 0 18")
            addPathData("M12.5 3c2.235 3.574 3.058 7.852 2.307 12")
            addPathData("M16 19h6")
        }
        return _worldMinus!!
    }

private var _worldMinus: ImageVector? = null
