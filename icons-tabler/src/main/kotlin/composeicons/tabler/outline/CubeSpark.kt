package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CubeSpark: ImageVector
    get() {
        if (_cubeSpark != null) return _cubeSpark!!
        _cubeSpark = tablerOutlineIcon(
            name = "CubeSpark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12v-4.01C20.999 7.28 20.617 6.625 20 6.273L13 2.265c-.62-.353-1.38-.353-2 0L4 6.273C3.381 6.628 3 7.283 3 7.991v8.018c0 .709 .381 1.363 1 1.717l7 4.008c.62 .354 1.38 .354 2 0")
            addPathData("M12 22v-10")
            addPathData("M12 12 20.73 6.96")
            addPathData("M3.27 6.96 12 12")
            addPathData("M19 22.5c.419-1.73 1.77-3.081 3.5-3.5C20.77 18.581 19.419 17.23 19 15.5c-.419 1.73-1.77 3.081-3.5 3.5 1.73 .419 3.081 1.77 3.5 3.5")
        }
        return _cubeSpark!!
    }

private var _cubeSpark: ImageVector? = null
