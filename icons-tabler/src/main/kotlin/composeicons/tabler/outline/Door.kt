package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Door: ImageVector
    get() {
        if (_door != null) return _door!!
        _door = tablerOutlineIcon(
            name = "Door",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 12v.01")
            addPathData("M3 21h18")
            addPathData("M6 21v-16C6 3.895 6.895 3 8 3h8c1.105 0 2 .895 2 2v16")
        }
        return _door!!
    }

private var _door: ImageVector? = null
