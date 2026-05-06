package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EscalatorDown: ImageVector
    get() {
        if (_escalatorDown != null) return _escalatorDown!!
        _escalatorDown = tablerOutlineIcon(
            name = "EscalatorDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.5 7h2.733c.494 0 .97 .183 1.337 .513L18 16h1.5C20.881 16 22 17.119 22 18.5 22 19.881 20.881 21 19.5 21h-2.733c-.494-0-.97-.183-1.337-.513L6 12h-1.5C3.119 12 2 10.881 2 9.5 2 8.119 3.119 7 4.5 7")
            addPathData("M18 3v7")
            addPathData("M15 7l3 3L21 7")
        }
        return _escalatorDown!!
    }

private var _escalatorDown: ImageVector? = null
