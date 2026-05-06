package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MeterCube: ImageVector
    get() {
        if (_meterCube != null) return _meterCube!!
        _meterCube = tablerOutlineIcon(
            name = "MeterCube",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 5h1.5C19.328 5 20 5.672 20 6.5 20 7.328 19.328 8 18.5 8h-.5 .5C19.328 8 20 8.672 20 9.5 20 10.328 19.328 11 18.5 11h-1.5")
            addPathData("M4 12v6")
            addPathData("M4 14c0-1.105 .895-2 2-2h.5C7.881 12 9 13.119 9 14.5v3.5")
            addPathData("M9 15.5v-1C9 13.119 10.119 12 11.5 12 12.881 12 14 13.119 14 14.5v3.5")
        }
        return _meterCube!!
    }

private var _meterCube: ImageVector? = null
