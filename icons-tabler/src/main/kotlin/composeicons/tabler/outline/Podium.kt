package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Podium: ImageVector
    get() {
        if (_podium != null) return _podium!!
        _podium = tablerOutlineIcon(
            name = "Podium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 8h14l-.621 2.485c-.223 .89-1.022 1.515-1.94 1.515h-8.878C6.643 12 5.844 11.375 5.621 10.485L5 8")
            addPathData("M7 8v-2C7 4.343 8.343 3 10 3")
            addPathData("M8 12l1 9")
            addPathData("M16 12l-1 9")
            addPathData("M7 21h10")
        }
        return _podium!!
    }

private var _podium: ImageVector? = null
