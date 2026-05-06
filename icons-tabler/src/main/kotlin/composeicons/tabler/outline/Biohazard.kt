package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Biohazard: ImageVector
    get() {
        if (_biohazard != null) return _biohazard!!
        _biohazard = tablerOutlineIcon(
            name = "Biohazard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M11.939 14c0 .173 .048 .351 .056 .533v.217c-0 2.539-1.997 4.629-4.533 4.745h-.217M2.495 14.745c0-1.83 1.052-3.498 2.704-4.286 1.652-.788 3.61-.558 5.033 .593M16.745 19.495c-1.391 0-2.713-.61-3.615-1.669-.902-1.059-1.295-2.46-1.075-3.834h-.06M13.759 11.048c1.393-1.126 3.301-1.373 4.934-.638 1.633 .735 2.715 2.326 2.797 4.115v.217M10.295 10.929C8.83 10.37 7.736 9.124 7.37 7.599 7.005 6.074 7.415 4.468 8.467 3.305l.164-.172M15.349 3.133c1.139 1.138 1.624 2.777 1.288 4.352-.336 1.575-1.448 2.872-2.953 3.446")
        }
        return _biohazard!!
    }

private var _biohazard: ImageVector? = null
