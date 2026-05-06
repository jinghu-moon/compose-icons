package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RectangularPrismPlus: ImageVector
    get() {
        if (_rectangularPrismPlus != null) return _rectangularPrismPlus!!
        _rectangularPrismPlus = tablerOutlineIcon(
            name = "RectangularPrismPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12.5v-3.509C20.999 8.281 20.617 7.626 20 7.274L16 5.266c-.62-.354-1.38-.354-2 0L4 10.273c-.619 .355-1 1.01-1 1.718v5.018c0 .709 .381 1.363 1 1.717l4 2.008c.62 .354 1.38 .354 2 0l2.062-1.032")
            addPathData("M9 21v-7.5")
            addPathData("M9 13.5 20.5 8")
            addPathData("M3.5 11 9 13.5")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _rectangularPrismPlus!!
    }

private var _rectangularPrismPlus: ImageVector? = null
