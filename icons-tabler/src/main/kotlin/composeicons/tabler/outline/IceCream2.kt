package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.IceCream2: ImageVector
    get() {
        if (_iceCream2 != null) return _iceCream2!!
        _iceCream2 = tablerOutlineIcon(
            name = "IceCream2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.657 11c.878-2.486 .03-5.254-2.09-6.822C13.447 2.61 10.552 2.61 8.432 4.178 6.312 5.746 5.464 8.514 6.342 11")
            addPathData("M6.342 11 12 22 17.657 11h-11.315")
        }
        return _iceCream2!!
    }

private var _iceCream2: ImageVector? = null
