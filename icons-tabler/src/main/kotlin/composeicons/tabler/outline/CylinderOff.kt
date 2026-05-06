package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CylinderOff: ImageVector
    get() {
        if (_cylinderOff != null) return _cylinderOff!!
        _cylinderOff = tablerOutlineIcon(
            name = "CylinderOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.23 5.233C5.08 5.478 5 5.735 5 6 5 7.131 6.461 8.117 8.62 8.628M12.977 8.971C16.381 8.767 19 7.515 19 6 19 4.343 15.866 3 12 3 10.355 3 8.842 3.243 7.647 3.65")
            addPathData("M5 6v12c0 1.657 3.134 3 7 3 3.245 0 5.974-.946 6.767-2.23M19 15v-9")
            addPathData("M3 3 21 21")
        }
        return _cylinderOff!!
    }

private var _cylinderOff: ImageVector? = null
