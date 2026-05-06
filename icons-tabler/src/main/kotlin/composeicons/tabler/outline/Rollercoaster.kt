package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Rollercoaster: ImageVector
    get() {
        if (_rollercoaster != null) return _rollercoaster!!
        _rollercoaster = tablerOutlineIcon(
            name = "Rollercoaster",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 21c2.389-0 4.51-1.529 5.265-3.795L9 15c1.194-3.583 4.548-6 8.325-6h3.675")
            addPathData("M20 9v12")
            addPathData("M8 21v-3")
            addPathData("M12 21v-10")
            addPathData("M16 9.5v11.5")
            addPathData("M15 3h5v3h-5v-3")
            addPathData("M6 8 10 5l2 2.5-4 3L6.2 10 6 8")
        }
        return _rollercoaster!!
    }

private var _rollercoaster: ImageVector? = null
