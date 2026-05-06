package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HeartPlus: ImageVector
    get() {
        if (_heartPlus != null) return _heartPlus!!
        _heartPlus = tablerOutlineIcon(
            name = "HeartPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 20 4.5 12.572C3.151 11.26 2.654 9.301 3.212 7.504 3.771 5.707 5.292 4.376 7.147 4.06 9.002 3.743 10.877 4.496 12 6.006c1.671-2.198 4.808-2.625 7.007-.954 2.198 1.671 2.625 4.808 .953 7.007")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _heartPlus!!
    }

private var _heartPlus: ImageVector? = null
