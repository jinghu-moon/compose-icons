package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SatelliteOff: ImageVector
    get() {
        if (_satelliteOff != null) return _satelliteOff!!
        _satelliteOff = tablerOutlineIcon(
            name = "SatelliteOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7.707 3.707l5.586 5.586M12 12l-1.293 1.293c-.391 .39-1.023 .39-1.414 0L3.707 7.707c-.39-.39-.39-1.023 0-1.414L5 5")
            addPathData("M6 10 3 13l3 3L9 13")
            addPathData("M10 6 13 3l3 3L13 9")
            addPathData("M12 12l1.5 1.5")
            addPathData("M14.5 17c.69 0 1.316-.28 1.769-.733")
            addPathData("M15 21c1.654 0 3.151-.67 4.237-1.752M20.744 16.741c.17-.565 .257-1.151 .256-1.741")
            addPathData("M3 3 21 21")
        }
        return _satelliteOff!!
    }

private var _satelliteOff: ImageVector? = null
