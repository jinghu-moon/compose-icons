package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.UmbrellaClosed: ImageVector
    get() {
        if (_umbrellaClosed != null) return _umbrellaClosed!!
        _umbrellaClosed = tablerOutlineIcon(
            name = "UmbrellaClosed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 16 12 3l3 13h-6")
            addPathData("M12 16v3c0 2.667 4 2.667 4 0")
        }
        return _umbrellaClosed!!
    }

private var _umbrellaClosed: ImageVector? = null
