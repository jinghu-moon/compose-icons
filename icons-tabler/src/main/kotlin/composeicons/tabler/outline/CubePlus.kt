package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CubePlus: ImageVector
    get() {
        if (_cubePlus != null) return _cubePlus!!
        _cubePlus = tablerOutlineIcon(
            name = "CubePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12.5v-4.509C20.999 7.281 20.617 6.626 20 6.274L13 2.266c-.62-.354-1.38-.354-2 0L4 6.273C3.381 6.628 3 7.283 3 7.991v8.018c0 .709 .381 1.363 1 1.717l7 4.008c.62 .354 1.38 .354 2 0")
            addPathData("M12 22v-10")
            addPathData("M12 12 20.73 6.96")
            addPathData("M3.27 6.96 12 12")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _cubePlus!!
    }

private var _cubePlus: ImageVector? = null
