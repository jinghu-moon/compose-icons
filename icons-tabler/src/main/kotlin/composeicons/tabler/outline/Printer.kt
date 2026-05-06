package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Printer: ImageVector
    get() {
        if (_printer != null) return _printer!!
        _printer = tablerOutlineIcon(
            name = "Printer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 17h2c1.105 0 2-.895 2-2v-4C21 9.895 20.105 9 19 9h-14C3.895 9 3 9.895 3 11v4c0 1.105 .895 2 2 2h2")
            addPathData("M17 9v-4C17 3.895 16.105 3 15 3h-6C7.895 3 7 3.895 7 5v4")
            addPathData("M7 15c0-1.105 .895-2 2-2h6c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-6C7.895 21 7 20.105 7 19v-4")
        }
        return _printer!!
    }

private var _printer: ImageVector? = null
