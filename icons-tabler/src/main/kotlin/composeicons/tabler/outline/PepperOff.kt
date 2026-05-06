package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PepperOff: ImageVector
    get() {
        if (_pepperOff != null) return _pepperOff!!
        _pepperOff = tablerOutlineIcon(
            name = "PepperOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.59 12.59C11.82 14.008 10.055 15 8 15 5.239 15 3 13.21 3 11c0 3.232 1.945 6.146 4.93 7.387 2.985 1.24 6.422 .563 8.713-1.717M18.283 14.313C18.757 13.273 19.001 12.143 19 11 19.001 9.661 18.114 8.484 16.827 8.115c-1.287-.369-2.663 .159-3.372 1.295")
            addPathData("M16 8C16 6 18 4 20 4")
            addPathData("M3 3 21 21")
        }
        return _pepperOff!!
    }

private var _pepperOff: ImageVector? = null
