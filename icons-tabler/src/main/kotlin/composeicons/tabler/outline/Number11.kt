package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number11: ImageVector
    get() {
        if (_number11 != null) return _number11!!
        _number11 = tablerOutlineIcon(
            name = "Number11",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 20v-16L3 9")
            addPathData("M18 20v-16L13 9")
        }
        return _number11!!
    }

private var _number11: ImageVector? = null
