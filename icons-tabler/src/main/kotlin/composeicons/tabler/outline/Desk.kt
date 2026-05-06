package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Desk: ImageVector
    get() {
        if (_desk != null) return _desk!!
        _desk = tablerOutlineIcon(
            name = "Desk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 6h18")
            addPathData("M4 6v13")
            addPathData("M20 19v-13")
            addPathData("M4 10h16")
            addPathData("M15 6v8c0 1.105 .895 2 2 2h3")
        }
        return _desk!!
    }

private var _desk: ImageVector? = null
