package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AugmentedRealityOff: ImageVector
    get() {
        if (_augmentedRealityOff != null) return _augmentedRealityOff!!
        _augmentedRealityOff = tablerOutlineIcon(
            name = "AugmentedRealityOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 8v-2C4 5.443 4.228 4.939 4.595 4.576")
            addPathData("M4 16v2c0 1.105 .895 2 2 2h2")
            addPathData("M16 4h2c1.105 0 2 .895 2 2v2")
            addPathData("M16 20h2c.558 0 1.062-.228 1.425-.596")
            addPathData("M12 12.5l.312-.195M14.769 10.769 16 10")
            addPathData("M9.225 9.235 8 10l4 2.5v4.5l3.076-1.923M16 12v-2L12 7.5l-.302 .189")
            addPathData("M8 10v4.5L12 17")
            addPathData("M3 3 21 21")
        }
        return _augmentedRealityOff!!
    }

private var _augmentedRealityOff: ImageVector? = null
