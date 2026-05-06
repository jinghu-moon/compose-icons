package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Grill: ImageVector
    get() {
        if (_grill != null) return _grill!!
        _grill = tablerOutlineIcon(
            name = "Grill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 8h-14c0 3.314 2.686 6 6 6h2c3.228 .002 5.879-2.549 6-5.775v-.225")
            addPathData("M17 20c-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2")
            addPathData("M15 14l1 2")
            addPathData("M9 14 6 20")
            addPathData("M15 18h-8")
            addPathData("M15 5v-1")
            addPathData("M12 5v-1")
            addPathData("M9 5v-1")
        }
        return _grill!!
    }

private var _grill: ImageVector? = null
