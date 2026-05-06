package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClockX: ImageVector
    get() {
        if (_clockX != null) return _clockX!!
        _clockX = tablerOutlineIcon(
            name = "ClockX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.926 13.15C21.417 9.336 19.431 5.631 15.982 3.929 12.533 2.228 8.385 2.905 5.657 5.616 2.928 8.326 2.224 12.47 3.903 15.93c1.679 3.46 5.371 5.47 9.188 5.004")
            addPathData("M12 7v5l2 2")
            addPathData("M22 22 17 17")
            addPathData("M17 22l5-5")
        }
        return _clockX!!
    }

private var _clockX: ImageVector? = null
