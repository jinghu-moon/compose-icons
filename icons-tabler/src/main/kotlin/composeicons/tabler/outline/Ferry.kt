package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ferry: ImageVector
    get() {
        if (_ferry != null) return _ferry!!
        _ferry = tablerOutlineIcon(
            name = "Ferry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 18h15.293c1.02 0 1.972-.503 2.536-1.34L22 13h-18.479L2 18")
            addPathData("M14 8 13 6")
            addPathData("M6.107 12.675 7.491 8h8l2.675 4.598")
        }
        return _ferry!!
    }

private var _ferry: ImageVector? = null
