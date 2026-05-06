package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CakeOff: ImageVector
    get() {
        if (_cakeOff != null) return _cakeOff!!
        _cakeOff = tablerOutlineIcon(
            name = "CakeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 17v-5C21 10.343 19.657 9 18 9h-5M9 9h-3C4.343 9 3 10.343 3 12v8h17")
            addPathData("M3 14.803c.312 .135 .654 .204 1 .197 .791 .017 1.539-.357 2-1 .461-.643 1.209-1.017 2-1 .791-.017 1.539 .357 2 1 .461 .643 1.209 1.017 2 1 .791 .017 1.539-.357 2-1M18 14c.461 .643 1.209 1.017 2 1 .35 .007 .692-.062 1-.197")
            addPathData("M10.172 6.188c.07-.158 .163-.31 .278-.451L12 4l1.465 1.638c.44 .473 .625 1.129 .496 1.762-.129 .633-.556 1.165-1.146 1.428")
            addPathData("M3 3 21 21")
        }
        return _cakeOff!!
    }

private var _cakeOff: ImageVector? = null
