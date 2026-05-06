package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrightnessOff: ImageVector
    get() {
        if (_brightnessOff != null) return _brightnessOff!!
        _brightnessOff = tablerOutlineIcon(
            name = "BrightnessOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3v5M12 12v9")
            addPathData("M5.641 5.631C2.123 9.143 2.119 14.842 5.631 18.36c3.512 3.517 9.211 3.522 12.729 .009M20.04 16.051C21.79 12.584 21.119 8.386 18.376 5.638 15.633 2.889 11.436 2.21 7.966 3.953")
            addPathData("M12.5 8.5 16.65 4.35")
            addPathData("M12 14l1.025-.983M15.09 11.036 19.37 6.93")
            addPathData("M12 19.6l3.79-3.79M17.79 13.81l3.054-3.054")
            addPathData("M3 3 21 21")
        }
        return _brightnessOff!!
    }

private var _brightnessOff: ImageVector? = null
