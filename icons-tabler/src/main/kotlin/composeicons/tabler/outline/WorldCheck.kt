package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WorldCheck: ImageVector
    get() {
        if (_worldCheck != null) return _worldCheck!!
        _worldCheck = tablerOutlineIcon(
            name = "WorldCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.946 12.99C21.351 9.329 19.485 5.79 16.234 4.057 12.983 2.325 9.005 2.748 6.191 5.126 3.378 7.504 2.297 11.356 3.464 14.85c1.167 3.494 4.345 5.925 8.022 6.135")
            addPathData("M3.6 9h16.8")
            addPathData("M3.6 15h13.9")
            addPathData("M11.5 3c-3.437 5.508-3.437 12.492 0 18")
            addPathData("M12.5 3c2.232 3.575 3.055 7.852 2.311 12.001")
            addPathData("M15 19l2 2 4-4")
        }
        return _worldCheck!!
    }

private var _worldCheck: ImageVector? = null
