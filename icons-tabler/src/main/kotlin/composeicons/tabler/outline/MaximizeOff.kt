package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MaximizeOff: ImageVector
    get() {
        if (_maximizeOff != null) return _maximizeOff!!
        _maximizeOff = tablerOutlineIcon(
            name = "MaximizeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 8v-2C4 5.449 4.223 4.95 4.584 4.588")
            addPathData("M4 16v2c0 1.105 .895 2 2 2h2")
            addPathData("M16 4h2c1.105 0 2 .895 2 2v2")
            addPathData("M16 20h2c.545 0 1.04-.218 1.4-.572")
            addPathData("M3 3 21 21")
        }
        return _maximizeOff!!
    }

private var _maximizeOff: ImageVector? = null
