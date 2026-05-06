package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.VolumeOff: ImageVector
    get() {
        if (_volumeOff != null) return _volumeOff!!
        _volumeOff = tablerOutlineIcon(
            name = "VolumeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 8c1.527 1.145 2.268 3.059 1.912 4.934M15.535 15.536c-.167 .167-.346 .322-.535 .464")
            addPathData("M17.7 5c3.308 2.673 4.293 7.297 2.362 11.086M18.386 18.385c-.218 .217-.447 .422-.686 .615")
            addPathData("M9.069 5.054l.431-.554c.181-.351 .59-.518 .964-.393 .374 .125 .602 .504 .536 .893v2M11 11v8c.066 .389-.161 .768-.536 .893-.374 .125-.784-.042-.964-.393L6 15h-2C3.448 15 3 14.552 3 14v-4C3 9.448 3.448 9 4 9h2L7.294 7.336")
            addPathData("M3 3 21 21")
        }
        return _volumeOff!!
    }

private var _volumeOff: ImageVector? = null
