package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EscalatorUp: ImageVector
    get() {
        if (_escalatorUp != null) return _escalatorUp!!
        _escalatorUp = tablerOutlineIcon(
            name = "EscalatorUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.5 7h-2.672c-.53 0-1.039 .211-1.414 .586L7 16h-2.5C3.119 16 2 17.119 2 18.5 2 19.881 3.119 21 4.5 21h3.672c.53-0 1.039-.211 1.414-.586L18 12h1.5C20.881 12 22 10.881 22 9.5 22 8.119 20.881 7 19.5 7")
            addPathData("M6 10v-7")
            addPathData("M3 6 6 3 9 6")
        }
        return _escalatorUp!!
    }

private var _escalatorUp: ImageVector? = null
