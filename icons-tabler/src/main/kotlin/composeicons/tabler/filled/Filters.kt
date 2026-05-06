package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Filters: ImageVector
    get() {
        if (_filters != null) return _filters!!
        _filters = tablerFilledIcon(
            name = "Filters",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.396 11.056c2.519 1.735 3.329 5.088 1.881 7.782-1.448 2.694-4.691 3.868-7.528 2.724q.206-.21 .396-.44c1.428-1.713 2.077-3.944 1.789-6.155 1.558-.881 2.777-2.258 3.462-3.911")
            addPathData("M4.609 11.051c1.517 3.69 5.523 5.695 9.386 4.698 .12 2.86-1.797 5.406-4.579 6.082C6.634 22.506 3.763 21.122 2.558 18.526 1.353 15.93 2.15 12.843 4.461 11.155Z")
            addPathData("M12 2c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6C8.686 14 6 11.314 6 8l.004-.225C6.125 4.551 8.774 2 12 2")
        }
        return _filters!!
    }

private var _filters: ImageVector? = null
