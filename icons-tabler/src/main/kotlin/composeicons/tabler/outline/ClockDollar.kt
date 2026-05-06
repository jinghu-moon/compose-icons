package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClockDollar: ImageVector
    get() {
        if (_clockDollar != null) return _clockDollar!!
        _clockDollar = tablerOutlineIcon(
            name = "ClockDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.866 10.45C20.021 5.618 15.463 2.352 10.617 3.107 5.77 3.861 2.42 8.357 3.083 13.217c.663 4.86 5.096 8.294 9.968 7.721")
            addPathData("M12 7v5l1.5 1.5")
            addPathData("M21 15h-2.5C17.672 15 17 15.672 17 16.5c0 .828 .672 1.5 1.5 1.5h1c.828 0 1.5 .672 1.5 1.5C21 20.328 20.328 21 19.5 21h-2.5")
            addPathData("M19 21v1M19 14v1")
        }
        return _clockDollar!!
    }

private var _clockDollar: ImageVector? = null
