package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ApertureOff: ImageVector
    get() {
        if (_apertureOff != null) return _apertureOff!!
        _apertureOff = tablerOutlineIcon(
            name = "ApertureOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3.6 15h10.55")
            addPathData("M5.641 5.631C2.123 9.143 2.119 14.842 5.631 18.36c3.512 3.517 9.211 3.522 12.729 .009M20.04 16.051C21.79 12.584 21.119 8.386 18.376 5.638 15.633 2.889 11.436 2.21 7.966 3.953")
            addPathData("M7.395 7.534l2.416 7.438")
            addPathData("M17.032 4.636 12.18 8.162 9.846 9.857l-1.349 .98")
            addPathData("M20.559 14.51 12.024 8.309")
            addPathData("M12.257 20.916l2.123-6.533M15.364 11.355l.154-.473")
            addPathData("M3 3 21 21")
        }
        return _apertureOff!!
    }

private var _apertureOff: ImageVector? = null
