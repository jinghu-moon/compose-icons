package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cup: ImageVector
    get() {
        if (_cup != null) return _cup!!
        _cup = tablerOutlineIcon(
            name = "Cup",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 11h14v-3h-14v3")
            addPathData("M17.5 11 16 21h-8L6.5 11")
            addPathData("M6 8v-1C6 5.895 6.895 5 8 5h8c1.105 0 2 .895 2 2v1")
            addPathData("M15 5v-2")
        }
        return _cup!!
    }

private var _cup: ImageVector? = null
