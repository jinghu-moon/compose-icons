package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Om: ImageVector
    get() {
        if (_om != null) return _om!!
        _om = tablerOutlineIcon(
            name = "Om",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 12c2.21 0 4-1.567 4-3.5C11 6.567 9.21 5 7 5 5.406 5 4.03 5.816 3.387 7")
            addPathData("M3.423 14.483c-.281 .635-.425 1.322-.423 2.017C3 18.985 4.79 21 7 21c2.21 0 4-2.015 4-4.5C11 14.015 9.21 12 7 12")
            addPathData("M14.071 17.01c.327 2.277 1.739 3.99 3.429 3.99C19.433 21 21 18.761 21 16c0-2.761-1.567-5-3.5-5-.96 0-1.868 .606-2.5 1.5-.717 1.049-1.76 1.7-2.936 1.7-.92 0-1.766-.406-2.434-1.087")
            addPathData("M17 3l2 2")
            addPathData("M12 3c1.667 3.667 4.667 5.333 9 5")
        }
        return _om!!
    }

private var _om: ImageVector? = null
