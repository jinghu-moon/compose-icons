package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AntennaOff: ImageVector
    get() {
        if (_antennaOff != null) return _antennaOff!!
        _antennaOff = tablerOutlineIcon(
            name = "AntennaOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 4v8")
            addPathData("M16 4.5v7")
            addPathData("M12 5v3M12 12v9")
            addPathData("M8 8v2.5")
            addPathData("M4 6v4")
            addPathData("M20 8h-8M8 8h-4")
            addPathData("M3 3 21 21")
        }
        return _antennaOff!!
    }

private var _antennaOff: ImageVector? = null
